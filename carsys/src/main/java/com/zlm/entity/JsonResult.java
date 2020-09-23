package com.zlm.entity;

public class JsonResult {
    private int code;
    private Object info;

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public JsonResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
