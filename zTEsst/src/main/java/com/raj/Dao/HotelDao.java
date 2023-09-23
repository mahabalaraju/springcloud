package com.raj.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {
 
	public List<String> fetchavailableRooms() throws SQLException{
		List<String> availableRooms=new ArrayList<>();
		Connection connection = DriverManager.getConnection("");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(null);
		while(rs.next()) {
			availableRooms.add(rs.getString("Room no"));
		}
		return availableRooms;
	}
}
