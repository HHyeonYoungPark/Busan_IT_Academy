package com.hs.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class RDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Value("com.hs.selectReply")
	private String selectReply;
	
	@Value("com.hs.insertReply")
	private String insertReply;
	
	@Value("com.hs.deleteReply")
	private String deleteReply;
	
	
	public List<RDto> selectReply(int boardidx){
		return sqlSession.selectList(selectReply, boardidx);
	}
	
	public int insertReply(RDto dto){
		return sqlSession.insert(insertReply, dto);
	}
	
	public int deleteReply(RDto dto){
		return sqlSession.delete(deleteReply, dto);
	}
}
