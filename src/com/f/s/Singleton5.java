package com.f.s;

/**
 * 双重检查
 * 保证线程安全
 */
public class Singleton5 {
    private static volatile Singleton5 INSTANCE;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }

}
