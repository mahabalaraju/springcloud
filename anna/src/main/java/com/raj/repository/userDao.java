package com.raj.repository;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class userDao {
	
		public String getUserId(String userName) {
			System.out.print("UserDao Called");
//			Random r=new Random();
//			int i = r.nextInt();
//			return i + userName;
			return 12211+userName; 
		}
}
