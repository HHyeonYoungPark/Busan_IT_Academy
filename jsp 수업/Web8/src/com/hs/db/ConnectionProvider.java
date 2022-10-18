package com.hs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionProvider {
	public static Connection getConnection() throws NamingException, SQLException{
		Context initContext  = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/mysql");
		// DataSource 인터페이스 => new가 안됩니다.
		Connection conn = ds.getConnection();
		return conn;
	}
	
	public static void freeConnetion(Connection c, PreparedStatement p) {
		try {
			if(p != null) p.close();
			if(c != null) c.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void freeConnetion(Connection c, PreparedStatement p, ResultSet r) {
		try {
			if(r != null) r.close();
			freeConnetion(c,p);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










