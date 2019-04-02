package com.f.s;

/**
 * 懒汉式单例
 * 只能在单线程下使用
 * 如果在多线程下:ThreadA进入了if (singleton == null)判断语句块，还未往下执行;
 * ThreadB也执行到这个判断语句,就会产生多个实例.
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
