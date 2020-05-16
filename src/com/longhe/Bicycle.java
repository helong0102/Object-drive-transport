package com.longhe;


/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:35
 * @version: 1.0.0
 * @modified By:
 */
public class Bicycle extends Transport {
    public Bicycle() {
    }

    public Bicycle(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Bicycle--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Bicycle--load");
    }

    @Override
    public void maintain() {
        System.out.println("Bicycle--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("Bicycle--addGos");
    }
}
