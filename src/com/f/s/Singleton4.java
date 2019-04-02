package com.f.s;

/**
 * 懒汉式单例
 * 效率低
 */
public class Singleton4 {
    private static Singleton4 INSTANCE;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                INSTANCE = new Singleton4();
            }
        }
        return INSTANCE;
    }
}
