package com.f.s;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 破坏单例
 */
public class DestructionSingleton {
    /**
     * 序列化
     * @throws Exception
     */
    @Test
    public void testSerializable() throws Exception{
        //获取到单例对象
        Singleton1 instance = Singleton1.getInstance();
        
        //序列化
        FileOutputStream fileOutputStream = new FileOutputStream("destruction");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance);

        //反序列化
        FileInputStream fileInputStream = new FileInputStream("destruction");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Singleton1 o = (Singleton1)objectInputStream.readObject();

        //打印结果
        System.out.println(instance == o);
    }

    /**
     * 反射
     * @throws Exception
     */
    @Test
    public void testReflect() throws Exception{
        Singleton1 s1 = Singleton1.getInstance();
        Class<?> clazz = Class.forName("com.f.s.Singleton1");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 s2 = (Singleton1) constructor.newInstance();
        if(s1 == s2) {
            System.out.println("单例未被破坏");
        }else {
            System.out.println("单例被破坏了");
        }
    }
}