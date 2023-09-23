package com.raj.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.Dao.AadharDao;
import com.raj.entityy.Aadhardetails;
import com.raj.exception.AadharDetailsnotfoundException;
@Service
public class Aadharservice {
	@Autowired
	AadharDao adharDao;

	public  Object fetchAdharById(String name) {

return adharDao.getaadharbyname(name);
//if(key==name) 
//		return key;
//
//	else {
//	throw new AadharDetailsnotfoundException("details not found with given : "+name);
//	}
//}
}}