//package com.bishe.cable_security.repository;
//
//import com.bishe.cable_security.model.MonitorData;
//import org.springframework.data.repository.CrudRepository;
//
//import java.awt.print.Pageable;
//import java.util.Date;
//import java.util.List;
//
//public interface MonitorRepository extends CrudRepository<MonitorData,String> {
//    /**
//     * 保存数据
//     * @param monitorData
//     */
//    void saveOneMonitorData(MonitorData monitorData);
//
//
//    /**
//     * 通过单元楼号查询上报数据
//     * @param bNo
//     * @param startDate
//     * @param endDate
//     * @return
//     */
//   List<MonitorData> findBybNo(String bNo, Date startDate, Date endDate, Pageable pageable);
//
//}
