package com.zk;
/**
 * Singleton1
 * @description 单例模式--饿汉式(静态变量)
 * @author zk
 * @date 2018年7月24日 下午9:03:32
 * @version 1.0
 */
public class Singleton1 {
    //定义一个私有的静态变量,存放这个类的实例对象,让当前类的get方法可以使用这个实例对象
    private static Singleton1 instance = new Singleton1();
    //私有的构造器,保证只能在当前类中新建对象
    private Singleton1(){}
    //提供一个公共静态的get方法,让其他类可以得到当前类的实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}
