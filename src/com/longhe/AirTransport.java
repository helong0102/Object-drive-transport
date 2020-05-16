package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 22:47
 * @version: 1.0.0
 * @modified By:
 */
public class AirTransport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private String dataOfPurchase;
    private String id;

    public AirTransport() {
    }

    public AirTransport(String ownership, String GPSPosition, String price, String dataOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dataOfPurchase = dataOfPurchase;
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("{" +
                "ownership='" + ownership + '\'' +
                ", GPSPosition='" + GPSPosition + '\'' +
                ", price='" + price + '\'' +
                ", dataOfPurchase='" + dataOfPurchase + '\'' +
                ", id='" + id + '\'' +
                '}');
    }
}
