package com.it;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AppMain {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-provider.xml");
        context.start();
        System.in.read();
    }
}
