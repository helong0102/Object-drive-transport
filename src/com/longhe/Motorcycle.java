package com.longhe;


/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:35
 * @version: 1.0.0
 * @modified By:
 */
public class Motorcycle extends Transport {
    public Motorcycle() {
    }

    public Motorcycle(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Motorcycle--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Motorcycle--load");
    }

    @Override
    public void maintain() {
        System.out.println("Motorcycle--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("Motorcycle--addGos");
    }
}
