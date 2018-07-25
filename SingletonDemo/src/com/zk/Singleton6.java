package com.zk;
/**
 * Singleton6
 * @description 单例模式--静态内部类
 * @author zk
 * @date 2018年7月25日 下午9:01:32
 * @version 1.0
 */
public class Singleton6 {
    private Singleton6(){};
    //静态内部类
    private static class SingletonClass{
        private static final Singleton6 instance = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return SingletonClass.instance;
    }
}
