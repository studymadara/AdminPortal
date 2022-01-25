package com.adminportal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.baseportal","com.adminportal"})
public class AdminPortalStartApp
{
    public static void main(String args[])
    {
        SpringApplication.run(AdminPortalStartApp.class,args);
    }
}
