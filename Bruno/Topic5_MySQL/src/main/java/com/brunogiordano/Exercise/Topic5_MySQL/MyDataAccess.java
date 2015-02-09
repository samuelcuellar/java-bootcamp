package com.brunogiordano.Exercise.Topic5_MySQL;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MyDataAccess {

	private String user = "root";
	private String pass = "root";
	private Connection conn = null;
	
	public MyDataAccess(){
		try{
			Class.forName("com.mysql.jdbc.Connection");
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/high-school",user,pass);
			if(conn != null){
				System.out.println("Conexion con la base de datos, OK");
			}
		}
		catch(SQLException ex){
			System.out.println("Problema al intentar conectar a la base de datos");
		}
		catch(ClassNotFoundException ex){
			System.out.println(ex);
		}
	}
	//method to consult the database
	public ResultSet getQuery(String query){
		Statement state = null;
		ResultSet result = null;
		try{
			state = (Statement) conn.createStatement();
			result = state.executeQuery(query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	//method to modify the database
	public void setQuery(String query){
		Statement state = null;
		try{
			state = (Statement) conn.createStatement();
			state.execute(query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
