package com.zk;
/**
 * Singleton5
 * @description 单例模式--懒汉式--双重检查+同步代码块--推荐使用
 * @author zk
 * @date 2018年7月24日 下午9:59:50
 * @version 1.0
 */
public class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){}
    public static Singleton5 getInstance(){
        //第一次判断
        if(instance == null){
            //同步代码块,解决线程安全问题
            synchronized (instance) {
                //第二次判断
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
