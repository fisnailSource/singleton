package com.f.s;

/**
 * 枚举单例
 * 避免多线程同步问题,防止反序列化
 */
public enum Singleton {
    INSTANCE;
    public void m() {

    }
}