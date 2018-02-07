package com.daoshan.school.controller;

import com.daoshan.bean.UserLogin;
import com.daoshan.dao.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
@RestController
@RequestMapping("demo")
public class UserLoginController {


    @Resource
    private UserLoginMapper userLoginMapper;

    @PostMapping("/userLogin")
    @ResponseBody
    public String Demo(){

        Map<String,Object> map = new HashMap<String,Object>();

        List<UserLogin> list = userLoginMapper.selectUserMse(map);

        return JSON.toJSONString(list);
    }
}