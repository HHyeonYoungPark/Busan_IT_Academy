package com.hs.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MvcDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Value("com.hs.selectAll")
	private String selectAll;
	
	@Value("com.hs.selectOne")
	private String selectOne;
	
	@Value("com.hs.insert")
	private String insert;
	
	@Value("com.hs.delete")
	private String delete;
	
	@Value("com.hs.update")
	private String update;
	
	
	@Value("com.hs.selectAllCnt")
	private String selectAllCnt;
	
	@Value("com.hs.selectAllP")
	private String selectAllP;	
	
	
	public List<MvcDto> selectAll(){
		return sqlSession.selectList(selectAll);
	}
	
	public MvcDto selectOne(int idx){
		return sqlSession.selectOne(selectOne, idx);
	}
	
	public int insert(MvcDto dto){
		return sqlSession.insert(insert, dto);
	}
	
	public int delete(int idx){
		return sqlSession.delete(delete, idx);
	}
	
	public int update(MvcDto dto){
		return sqlSession.update(update, dto);
	}
	
	public int selectAllCnt(){
		return sqlSession.selectOne(selectAllCnt);
	}
	
	public List<MvcDto> selectAllP(PagingVO vo){
		return sqlSession.selectList(selectAllP, vo);
	}
}
