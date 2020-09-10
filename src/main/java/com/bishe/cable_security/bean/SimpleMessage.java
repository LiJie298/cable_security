package com.bishe.cable_security.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lijie
 * @date 2020-09-10 20:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimpleMessage implements Serializable {
    private String publisher;
    private String content;
    private long createTime;
}

