package com.bishe.cable_security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 监控数据实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonitorData<T> {

    private String no;

    private String bNo;
    /**
     * 出现时间
     */
    private Date time;
    /**
     * 是否烟雾报警
     */
    private boolean isSmogWarn;
    /**
     * 上报温度数据
     */
    private List<Temperature> temperatures;


    class Temperature {
        /**
         * 电缆标示符
         */
        private int tag;
        /**
         * 具体数值
         */
        private int date;
    }

}

