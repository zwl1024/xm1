package com.it.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.it.servcie.UserService;
import org.springframework.util.StringUtils;

@Service(timeout = 10000)
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("111111======================");
    }


    @Override
    public String find(String id) {
        if (StringUtils.isEmpty(id)) {
            return "没有人员信息";
        }
        return "李四信息";
    }
}
