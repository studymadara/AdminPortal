package com.adminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminPortalController
{
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public @ResponseBody String sayHello()
    {
        return "Hello from Admin Portal";
    }
}
