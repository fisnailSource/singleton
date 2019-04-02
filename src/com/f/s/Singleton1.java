package com.f.s;

import java.io.Serializable;

/**
 * 饿汉式单例
 *
 * 优点：在类装载的时完成实例化,避免线程同步问题。
 * 缺点：在类装载的时就完成实例化,如果该实例一直未被使用,则造成内存浪费。
 */
public class Singleton1 implements Serializable {


    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}