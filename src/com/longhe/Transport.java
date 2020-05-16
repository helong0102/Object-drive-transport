package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:13
 * @version: 1.0.0
 * @modified By:
 */
public abstract class  Transport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String dataOfPurchase;
    private String id;

    public Transport() {
    }

    public Transport(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dataOfPurchase = dataOfPurchase;
        this.id = id;
    }

    /*驾驶方法*/
    public abstract void drivingMethod();
    /*交通工具装东西的方法*/
    public abstract void load();
    /*维修保养的方法*/
    public abstract void maintain();
    /*加油的方法*/
    public abstract void addGos();
}
