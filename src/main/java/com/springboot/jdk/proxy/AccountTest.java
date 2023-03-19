package com.springboot.jdk.proxy;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: TZH
 * @Date: 2023-03-19 22:26
 * @Description: 代理类测试
 */
public class AccountTest {
    public static void main(String[] args) {
        Account realAccount = new RealAccount("Test");

        //创建其增强类
        AccountHandler accountHandler = new AccountHandler(realAccount);
        //使用Java自带的反射
        Account proxy = (Account) Proxy.newProxyInstance(
                realAccount.getClass().getClassLoader(),
                realAccount.getClass().getInterfaces(),
                accountHandler
        );

        proxy.openAccount();
    }
}
