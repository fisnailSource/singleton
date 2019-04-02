package com.f.s;

/**
 * 静态内部类
 * 线程安全,延迟加载
 */
public class Singleton6 {
    private Singleton6() {}

    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
