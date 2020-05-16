package com.longhe;


/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:35
 * @version: 1.0.0
 * @modified By:
 */
public class Aircraft extends Transport {
    public Aircraft() {
    }

    public Aircraft(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Aircraft--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Aircraft--load");
    }

    @Override
    public void maintain() {
        System.out.println("Aircraft--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("Aircraft--addGos");
    }
}
