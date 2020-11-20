package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.model.*;
public class IUserImp {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public UserRole addUser(UserRole u) throws SQLException,IOException
	{
		ps=con.prepareStatement("insert into UserRole values(?,?,?)");
		
		ps.setString(1, u.getUserName());
		ps.setString(1, u.getPassword());
		ps.setString(3, u.getRoleCode());
		ps.executeUpdate();
		
		return u;
	}

}
