package com.atguigu.gmall1204.user.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall1204.bean.UserAddress;
import com.atguigu.gmall1204.bean.UserInfo;
import com.atguigu.gmall1204.service.UserInfoService;
import com.atguigu.gmall1204.user.mapper.UserAddressMapper;
import com.atguigu.gmall1204.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UderInfoServiceImpl implements UserInfoService {
   //调用mapper
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByNickName(String nickName) {
        return null;
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void updUser(UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }

 @Override
 public List<UserAddress> findUserAddressListByUserId(String userId) {

     //查询哪张表就用哪张表的mapper
   UserAddress userAddress=new UserAddress();
   userAddress.setUserId(userId);
  return userAddressMapper.select(userAddress);
 }

 @Override
 public List<UserAddress> findUserAddressListByUserId(UserAddress userAddress) {
  return userAddressMapper.select(userAddress);
 }

}
