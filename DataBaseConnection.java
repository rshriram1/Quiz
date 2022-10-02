package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
public class DataBaseConnection 
{
	Connection connection = null;
	public Connection getconnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sp@rk");
		}
		catch(Exception e)
		{
			System.out.println("Problem With Database");
		}
		return connection;
	}
}
