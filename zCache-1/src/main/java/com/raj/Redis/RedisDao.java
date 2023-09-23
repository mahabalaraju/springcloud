package com.raj.Redis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.raj.model.User;

@Repository
public class RedisDao {

	public static final String HASH_KEY="Product";
	
	@Autowired
	private RedisTemplate template;
	
	public User save( User product) {
		template.opsForHash().put(HASH_KEY,product.getId() , product);
		return product;
	}
	
	public List<User> getall(){
		return template.opsForHash().values(HASH_KEY);
	}
	
	public User getallbyuserid(int id) {
		return (User) template.opsForHash().get(HASH_KEY,id);
	}
	
	public String delete(int id) {
	template .opsForHash().delete(HASH_KEY, id);
	return "User Removed!";
	}
	
}










