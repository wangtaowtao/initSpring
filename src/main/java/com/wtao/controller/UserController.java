package com.wtao.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.wtao.common.Const;
import com.wtao.common.ResponseCode;
import com.wtao.common.ServerResponse;
import com.wtao.pojo.User;
import com.wtao.service.IUserService;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;
    

    /**
     * 用户登录
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
    	ServerResponse<User> response = iUserService.login(username, password);
        return response;
    }
    
    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<User> login1(String username, String password, HttpSession session){
    	ServerResponse<User> response = iUserService.login(username, password);
        return response;
    }
    
    
    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse login(String str){
    	User user = new User();
    	user.setCreateTime(new Date());
        return ServerResponse.createBySuccess(user);
    }

    
}
