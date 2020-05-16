package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 23:11
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

    /*驾驶方法*/
    public  void drivingMethod(Transport transport){
        transport.drivingMethod();
    }

    /*交通工具装东西的方法*/
    public  void load(Transport transport){
        transport.load();
    }

    /*维修保养的方法*/
    public  void maintain(Transport transport){
        transport.maintain();
    }

    /*加油的方法*/
    public  void addGos(Transport transport){
        transport.addGos();
    }



}
