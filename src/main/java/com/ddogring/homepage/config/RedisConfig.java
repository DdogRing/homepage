package com.ddogring.homepage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author DdogRing
 * @date 2021/1/19 16:30
 * @description Redis配置
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> template = new RedisTemplate<>();
        // 关联
        template.setConnectionFactory(factory);

        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

        // 设置key的序列化器采用String
        template.setKeySerializer(stringRedisSerializer);
        // 设置value的序列化器采用Jackson
        template.setValueSerializer(jackson2JsonRedisSerializer);
        // 设置hash的key序列化器采用String
        template.setHashKeySerializer(stringRedisSerializer);
        // 设置hash的value序列化器采用Jackson
        template.setHashValueSerializer(jackson2JsonRedisSerializer);

        return template;
    }
}
