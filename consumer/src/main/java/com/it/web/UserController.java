package com.it.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.it.servcie.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user",produces = "application/json; charset=UTF-8")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable("id") String id) {
        return userService.find(id);
    }
}
