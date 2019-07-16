package com.bishe.cable_security.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 监控数据实体
 */
@Data
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

    public MonitorData() {
        temperatures = new ArrayList<>();

    }

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

