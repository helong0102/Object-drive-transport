package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 21:48
 * @version: 1.0.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(int p_Age, String p_Sex, String id, String p_Name) {
        this.p_Age = p_Age;
        this.p_Sex = p_Sex;
        this.id = id;
        this.p_Name = p_Name;
    }

    public void driveTransport(Aircraft aircraft){
        aircraft.drivingMethod();
    }

    public void driveTransport(Airship airship){
        airship.drivingMethod();
    }

    public void driveTransport(Automobile automobile){
        automobile.drivingMethod();
    }

    public void driveTransport(Bicycle bicycle){
        bicycle.drivingMethod();
    }

    public void driveTransport(HotAirBalloon hotAirBalloon){
        hotAirBalloon.drivingMethod();
    }

    public void driveTransport(Hovercraft hovercraft){
        hovercraft.drivingMethod();
    }

    public void driveTransport(Motorcycle motorcycle){
        motorcycle.drivingMethod();
    }

    public void driveTransport(Ship ship){
        ship.drivingMethod();
    }

    public void driveTransport(Submarine submarine){
        submarine.drivingMethod();
    }

}
