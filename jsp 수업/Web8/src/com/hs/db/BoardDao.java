package com.hs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.NamingException;

import com.hs.bean.BoardDto;

public class BoardDao {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	int res;
	String sql;
	Vector<BoardDto> vboard;
	BoardDto bdto;
	
	public Vector<BoardDto> getDataAll(){
		vboard = new Vector<>();
		try {
			conn = ConnectionProvider.getConnection();
			sql = "select * from board8";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDto dto = new BoardDto(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6));
				vboard.add(dto);
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionProvider.freeConnetion(conn, pstmt, rs);
		}
		
		
		return vboard;
	}// end of method
	
	public int insertData(BoardDto dto) {
		try {
			conn = ConnectionProvider.getConnection();
			sql = "INSERT INTO board8 VALUES (NULL, ?,?,NOW(),?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getFilename());
			res = pstmt.executeUpdate();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionProvider.freeConnetion(conn, pstmt);
		}
		
		
		return res;
	}
	
	
	public BoardDto getDataOne(int idx) {
		try {
			conn = ConnectionProvider.getConnection();
			sql = "select * from board8 where idx=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();			
			if(rs.next()) {
				bdto = new BoardDto(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6));				
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return bdto;
	}
	
}// end of class










