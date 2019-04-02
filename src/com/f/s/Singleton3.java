package com.f.s;

/**
 * 懒汉式单例
 * 效率低
 */
public class Singleton3 {
    private static Singleton3 INSTANCE;

    private Singleton3() {}

    public static synchronized Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
