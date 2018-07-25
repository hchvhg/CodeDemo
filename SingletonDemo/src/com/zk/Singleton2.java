package com.zk;
/**
 * Singleton2
 * @description 单例模式--饿汉式(静态代码块)
 * @author zk
 * @date 2018年7月24日 下午9:27:28
 * @version 1.0
 */
public class Singleton2 {
    //定义一个私有的静态变量
    private static Singleton2 instance;
    //通过静态代码块给私有的静态变量赋值,指向当前类的实例对象
    static{
        instance = new Singleton2();
    }
    //私有化构造方法,保证只有当前类可以创建实例对象
    private Singleton2(){};
    //公共的静态get方法,让其他类可以获得实例对象
    public static Singleton2 getInstance(){
        return instance;
    }
}
