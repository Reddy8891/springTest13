package com.training.springmvc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.training.springmvc.model.User;
@Service
public class InsertData  {
	
	public String AddData(@ModelAttribute("user") User user) throws ClassNotFoundException, SQLException {
		
		Connection con=DatabaseConnection.initializeDatabase();
		
		PreparedStatement st = con.prepareStatement("insert into user1 values(?, ?)");
		st.setString(1, user.getName());
		st.setInt(2, user.getPasswd());
		st.executeUpdate();
		
		return "success";
		
	}
}
