package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.execption.*;
import com.cg.model.*;

public class JClass {
static Connection con;
public static Connection getConnection() throws SQLException{
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");
	return con;
	


}}