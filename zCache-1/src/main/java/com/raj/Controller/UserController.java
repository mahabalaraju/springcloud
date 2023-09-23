package com.raj.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.raj.Redis.RedisDao;
import com.raj.model.User;

@RestController
public class UserController {

	@Autowired
	private RedisDao ser;
	
	@GetMapping("/Users")
	public ResponseEntity<List<User>> getallUsers(){
		return ResponseEntity.ok(ser.getall());
	}
	
	@GetMapping("/Users/{id}")
	public ResponseEntity<User> getbyid(@PathVariable int  id){
		return ResponseEntity.ok(ser.getallbyuserid(id));
	}
	
	
	@DeleteMapping("/Users/{id}")
	public ResponseEntity<?> deletebyid(@PathVariable int id){
		this.ser.delete(id);
	return (ResponseEntity<?>) ResponseEntity.ok();
	}
	
	@PostMapping("/Users")
	public ResponseEntity<User> save(@RequestBody User User){
		return ResponseEntity.ok(ser.save(User));
	}

}
