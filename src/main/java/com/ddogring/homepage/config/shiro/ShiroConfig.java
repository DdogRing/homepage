package com.ddogring.homepage.config.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author DdogRing
 * @date 2021/2/20 09:02
 * @description Shiro的基本配置
 */
@Configuration
public class ShiroConfig {

    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier(value = "manager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);

        // 添加shiro的内置过滤器
        /*
            anon: 无需认证就可以访问
            authc: 必须认证了才能访问
            user: 必须拥有 记住我 功能才能用
            perms: 拥有对某个资源的权限才能访问
            role: 拥有某个角色权限才能访问
         */
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();

        // 配置不会拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/lib/**", "anon");
        filterChainDefinitionMap.put("/mapper/**", "anon");
        filterChainDefinitionMap.put("/templates/**", "anon");
        filterChainDefinitionMap.put("/login", "anon");
        filterChainDefinitionMap.put("/toLogin", "anon");
        filterChainDefinitionMap.put("/user/register", "anon");

        // 配置退出 过滤器
        filterChainDefinitionMap.put("logout", "logout");
        // filterChainDefinitionMap.put("/**", "authc");
        // 配置shiro默认登录界面地址，前后端分离中登录页面跳转应由前端控制，后端仅提供json
        // shiroFilterFactoryBean.setLoginUrl("unauth");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * DefaultWebSecurityManager
     * @author DdogRing
     * @date 2021/2/20
     * @param userRealm
     * @return org.apache.shiro.web.mgt.DefaultWebSecurityManager
     */
    @Bean(name = "manager")
    public DefaultWebSecurityManager getSecurityManager(@Qualifier(value = "userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 关联UserRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    /**
     * 创建realm对象
     * @author DdogRing
     * @date 2021/2/20
     * @param
     * @return com.qb.qbyg.config.shiro.UserRealm
     */
    @Bean(name = "userRealm")
    public UserRealm userRealm(@Qualifier(value = "hashedCredentialsMatcher") HashedCredentialsMatcher hashedCredentialsMatcher){
        UserRealm userRealm = new UserRealm();
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        return userRealm;
    }

    /**
     * 密码匹配凭证管理器(由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了)
     * @author DdogRing
     * @date 2021/2/22
     * @param
     * @return org.apache.shiro.authc.credential.HashedCredentialsMatcher
     */
    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        // 采用MD5方式加密
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        // 设置加密次数 比如散列的次数为2 相当于 md5(md5("password"));
        hashedCredentialsMatcher.setHashIterations(1);
        // 设置存储凭证十六进制编码
        hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
        return hashedCredentialsMatcher;
    }

    /**
     * Shiro生命周期处理器
     * 此方法需要用static作为修饰符, 否则无法通过@Value()注解的方式获取配置文件的值
     * @author DdogRing
     * @date 2021/2/23
     * @param
     * @return org.apache.shiro.spring.LifecycleBeanPostProcessor
     */
    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}
