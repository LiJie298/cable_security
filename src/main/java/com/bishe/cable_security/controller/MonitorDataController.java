package com.bishe.cable_security.controller;

import com.bishe.cable_security.util.BakMsg;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/monitor")
public class MonitorDataController {


    /**
     * 查询一段时间内 某个单元楼的上报数据
     *
     * @param bNo
     * @param startDate
     * @param endDate
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "find", method = RequestMethod.GET)
    public String findMonitorData(@RequestParam String bNo, @RequestParam String startDate, @RequestParam String endDate) {
        return BakMsg.successMsg("");
    }

    /**
     * 通过Id删除上报数据
     *
     * @param no
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "del", method = RequestMethod.POST)
    public String delMonitorData(@RequestParam String no) {
        if (StringUtils.isBlank(no)) {
            return BakMsg.errorMsg("上传数据编号为空，请检查...");
        }
        return BakMsg.successMsg("");
    }


}
