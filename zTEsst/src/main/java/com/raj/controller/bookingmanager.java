package com.raj.controller;

import java.sql.SQLException;
import java.util.List;

import com.raj.Dao.HotelDao;

public class bookingmanager {
private HotelDao dao;

public bookingmanager(HotelDao dao) {
	super();
	this.dao = dao;
}
public boolean checkAvailabeRooms(String name) throws SQLException {
	List<String> roomsAvailabe=dao.fetchavailableRooms();
	return roomsAvailabe.contains(roomsAvailabe);
}
}
