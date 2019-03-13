package com.bishe.cable_security.service;

import com.bishe.cable_security.model.MonitorData;

import java.util.Date;
import java.util.List;

public interface MonitorService {

    /**
     *  查询 单元楼数据
     * @param bNo
     * @param startDate
     * @param endDate
     * @return
     */
    List<MonitorData> findMonitorData(String bNo, Date startDate,Date endDate);

    /**
     * 删除上报数据
     * @param ids
     * @return
     */
    boolean delMonitorData(String ids);
}
