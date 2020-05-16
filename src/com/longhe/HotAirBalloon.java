package com.longhe;


/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:35
 * @version: 1.0.0
 * @modified By:
 */
public class HotAirBalloon extends Transport {
    public HotAirBalloon() {
    }

    public HotAirBalloon(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("HotAirBalloon--drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("HotAirBalloon--load");
    }

    @Override
    public void maintain() {
        System.out.println("HotAirBalloon--maintain");
    }

    @Override
    public void addGos() {
        System.out.println("HotAirBalloon--addGos");
    }
}
