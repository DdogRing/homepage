package com.ddogring.homepage.service.serviceImpl;

import com.ddogring.homepage.mapper.UserMapper;
import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.UserService;
import com.ddogring.homepage.util.SaltUtil;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author DdogRing
 * @date 2021/2/17 0017 10:03
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {

        // 生成随机串
        String generateSalt = SaltUtil.generateSalt(10);
        // 生成加密字符串
        String salt = ByteSource.Util.bytes(user.getUsername() + generateSalt).toString();
        user.setSalt(generateSalt);

        /*
         * new SimpleHash("加密方法", "明文密码", "盐值", "Hash次数")
         * 加密方法(md5, SHA-1, SHA-256, SHA-512)等
         */

        // 加密后的密码
        String passwordEncode = new SimpleHash("MD5", user.getPassword(), salt, 1024).toString();
        user.setPassword(passwordEncode);

        // 生成当前时间戳
        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdTime(date);
        return userMapper.insertSelective(user);
    }

    @Override
    public User getByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

}
