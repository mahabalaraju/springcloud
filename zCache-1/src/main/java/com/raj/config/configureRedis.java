package com.raj.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.ConnectionFactory;

@Configuration
@EnableRedisRepositories
@Qualifier(value = "jedisConnectionFactory") 
public class configureRedis {

	@Bean
	public JedisConnectionFactory asdf() {
		RedisStandaloneConfiguration redis= new RedisStandaloneConfiguration();
		redis.setHostName("192.168.1.3");
		redis.setPort(6379);
		return new JedisConnectionFactory(redis);
	}
	
	@Bean
	public RedisTemplate<String, Object>redistemplate(){
		
		RedisTemplate<String, Object> redis= new RedisTemplate<>();
		redis.setConnectionFactory(asdf());
		redis.setKeySerializer(new StringRedisSerializer());
		redis.setHashKeySerializer(new StringRedisSerializer());
		redis.setHashKeySerializer(new JdkSerializationRedisSerializer());
		redis.setValueSerializer(new JdkSerializationRedisSerializer());
		redis.setEnableTransactionSupport(true);
		redis.afterPropertiesSet();
		return redis;
	}
}








