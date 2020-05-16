package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 22:47
 * @version: 1.0.0
 * @modified By:
 */
public class MaritimeMeansOfTransport extends Transport{
    public MaritimeMeansOfTransport() {
    }
    public MaritimeMeansOfTransport(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        super(ownership, GPSPosition, price, dataOfPurchase, id);
    }
}
