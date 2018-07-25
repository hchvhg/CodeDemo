package com.zk;
/**
 * Singleton3
 * @description 单例模式--懒汉式--线程不安全,不可用
 * @author zk
 * @date 2018年7月24日 下午9:46:44
 * @version 1.0
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){};
    public static Singleton3 getInstance(){
        //懒加载,用到的时候才创建对象,但是存在线程安全问题
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
