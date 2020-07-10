package com.bishe.cable_security.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回对象
 */
public class BakMsg {
    /**
     * 请求状态，成功 1  失败 0
     */
    private int status;
    /**
     * 请求返回信息 ，成功 success， 失败  错误信息提示
     */
    private String msg;
    /**
     * 返回数据，没有数据时 返回{}
     */
    private Object data;

    public BakMsg() {
    }

    public BakMsg(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     * 获取成功信息
     *
     * @param data 返回数据
     * @return
     */
    public static String successMsg(Object data) {
        BakMsg bakMsg = new BakMsg();
        bakMsg.setStatus(1);
        bakMsg.setMsg("success");
        bakMsg.setData(data);
        return bakMsg.toString();
    }

    /**
     * 获取错误返回信息
     *
     * @param msg
     * @param data
     * @return
     */
    public static String errorMsg(String msg, Object data) {
        BakMsg bakMsg = new BakMsg();
        bakMsg.setStatus(0);
        bakMsg.setMsg(msg);
        bakMsg.setData(data);
        return bakMsg.toString();
    }

    /**
     * 获取返回信息
     *
     * @param status
     * @param msg
     * @param data
     * @return
     */
    public static String backMsg(int status, String msg, Object data) {
        if (status == 0) {
            return errorMsg(msg, data);
        } else if (status == 1) {
            return successMsg(data);
        } else {
            return new BakMsg(status, msg, data).toString();
        }
    }

    /**
     * 获取错误返回信息
     *
     * @param msg
     * @return
     */
    public static String errorMsg(String msg) {
        return errorMsg(msg, "");
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
