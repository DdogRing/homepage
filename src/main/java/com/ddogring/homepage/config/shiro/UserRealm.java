package com.ddogring.homepage.config.shiro;

import com.ddogring.homepage.model.User;
import com.ddogring.homepage.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author DdogRing
 * @date 2021/2/20 09:10
 * @description 自定义Realm
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 授权
     * @author DdogRing
     * @date 2021/2/20
     * @param principals
     * @return org.apache.shiro.authz.AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return null;
    }

    /**
     * 认证
     * @author DdogRing
     * @date 2021/2/20
     * @param authenticationToken
     * @return org.apache.shiro.authc.AuthenticationInfo
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 获取用户输入的账号
        String username = token.getUsername();
        // 查询用户信息
        User user = userService.selectByUsername(username);
        if(null == user){
            // 未找到指定用户 return null 抛出UnknownAccountException异常
            return null;
        }

        System.out.println(ByteSource.Util.bytes(user.getSalt()));
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user, // 用户
                user.getPassword(), // 用户密码
                ByteSource.Util.bytes(user.getSalt()), // salt
                getName()); // Realm name
        return simpleAuthenticationInfo;
    }
}
