package com.zk;
/**
 * Singleton
 * @description 单例模式--懒汉式--同步方法--可用但不推荐
 * @author zk
 * @date 2018年7月24日 下午9:51:30
 * @version 1.0
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){};
    //在Singleton3的基础上加上了synchronized变成同步方法,解决了线程不安全问题,但有性能问题
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
