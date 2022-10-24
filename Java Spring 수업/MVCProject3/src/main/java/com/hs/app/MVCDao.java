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
//	private String insert; // @Value�� ������ ���� �ִ� �������̼�
	private String insert = "INSERT INTO member1 VALUES(null,?,?,?)";
	
	public int insertData(MVCDto dto) {
		int res = 0;		
		res = jdbcTmp.update(insert, dto.getId(), dto.getPw(), dto.getName());		
		return res;
		
//		return jdbcTmp.update(insert, dto.getId(), dto.getPw(), dto.getName()); �̷��� �ۼ��ϸ� �ڵ尡 ª����
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
	
	
	// select �ϱ� ���ؼ��� jdbcTmp�� ��� roeMapper Ŭ������ �ʿ��ϴ�
	// �� �״�� row�� dto�� 1:1 ���� ��Ű�� Ŭ�����̴�
	class MVCMapper implements RowMapper<MVCDto>{

		@Override
		public MVCDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			// ������ �̷������� �߾�����..
//			MVCDto dto = new MVCDto();
//			dto.setIdx(rs.getInt(1));
//			dto.setId(rs.getString(2));
//			dto.setPw(rs.getString(3));
//			dto.setName(rs.getString(4));
//			return dto;
			
			return new MVCDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		
	}
	
	
	
	
} // Ŭ���� ��
