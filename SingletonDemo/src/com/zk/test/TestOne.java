package com.zk.test;

import com.zk.Singleton7;

public class TestOne {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.INSTANCE;
        instance.sys();
    }
}
