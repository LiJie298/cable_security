package com.bishe.cable_security;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;

/**
 * TODO
 *
 * @author lijie
 * @date 2019-12-09 12:10
 */
public class ImageTest {

    public static void main(String[] args) {

        String filePath = "/Users/lijie/Downloads/IMG_2106.HEIC";
        File jpegFile = new File(filePath);
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.println(tag);
                }
            }
        } catch (Exception e) {

        }

    }
}
