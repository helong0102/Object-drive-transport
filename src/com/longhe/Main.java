package com.longhe;

/**
 * @description:
 * @author: HeLong
 * @date: Created in 2020/5/16 22:01
 * @version: 1.0.0
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(18,"男","001","张三");
        person.driveTransport(new Aircraft("张三","海上","17777","456","001"));
    }
}
