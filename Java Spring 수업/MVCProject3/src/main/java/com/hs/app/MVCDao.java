package com.hs.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MVCDao {
	
	@Autowired
	private JdbcTemplate jdbcTmp;
	
//	@Value("INSERT INTO member1 VALUES(null,?,?,?)")
//	private String insert; // @Value는 변수에 값을 넣는 에노테이션
	private String insert = "INSERT INTO member1 VALUES(null,?,?,?)";
	
	public int insertData(MVCDto dto) {
		int res = 0;		
		res = jdbcTmp.update(insert, dto.getId(), dto.getPw(), dto.getName());		
		return res;
		
//		return jdbcTmp.update(insert, dto.getId(), dto.getPw(), dto.getName()); 이렇게 작성하면 코드가 짧아짐
	}
	
	
	@Value("DELETE FROM member1 WHERE idx=?")
	private String delete;
	
	public int deleteData(int idx) {
		return jdbcTmp.update(delete, idx);
	}
	
	
	@Value("SELECT * FROM member1")
	private String selectAll;
	public List<MVCDto> selectDataAll(){
		return jdbcTmp.query(selectAll, new MVCMapper());
	}
	
	@Value("UPDATE member1 SET id=? , pw=? name=? WHERE = idx")
	private String update;
	public int updateData(int idx) {
		return jdbcTmp.update(update, idx);
	}
	
	
	// select 하기 위해서는 jdbcTmp의 경우 roeMapper 클래스가 필요하다
	// 말 그대로 row와 dto를 1:1 맵핑 시키는 클래스이다
	class MVCMapper implements RowMapper<MVCDto>{

		@Override
		public MVCDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			// 원래는 이런식으로 했었지요..
//			MVCDto dto = new MVCDto();
//			dto.setIdx(rs.getInt(1));
//			dto.setId(rs.getString(2));
//			dto.setPw(rs.getString(3));
//			dto.setName(rs.getString(4));
//			return dto;
			
			return new MVCDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		
	}
	
	
	
	
} // 클래스 끝
