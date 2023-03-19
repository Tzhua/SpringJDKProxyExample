package com.springboot.jdk.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: TZH
 * @Date: 2023-03-16 00:09
 * @Description: 接口反射实现类
 */
public class RealAccount implements Account{

    String name;

    public RealAccount(String name) {
        this.name = name;
    }


    @Override
    public void openAccount() {
        System.out.println("Open the account is name:"+name);
    }
}
