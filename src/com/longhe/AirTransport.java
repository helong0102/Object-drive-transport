package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 22:23
 * @version: 1.0.0
 * @modified By:
 */
public class AirTransport extends Transport{
    public AirTransport() {
    }
    public AirTransport(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
