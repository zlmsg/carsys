package com.zlm.entity;

public class Order {
    private int id;
    private int cid;
    private int uid;
    private String  getid;
    private String backid;
    private double oprice;
    private String status;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getGetid() {
        return getid;
    }

    public void setGetid(String getid) {
        this.getid = getid;
    }

    public String getBackid() {
        return backid;
    }

    public void setBackid(String backid) {
        this.backid = backid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
