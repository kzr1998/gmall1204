package com.atguigu.gmall1204.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall1204.bean.UserAddress;
import com.atguigu.gmall1204.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("trade")
    @ResponseBody //返回json字符串  将控制器的数据直接输入到一个空白页面
    public List<UserAddress> trade(String userId){

        return userInfoService.findUserAddressListByUserId(userId);
    }
}
