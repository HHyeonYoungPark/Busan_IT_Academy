package com.hs.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Value("com.hs.selectAll")
	private String selectAll;
	
	@Value("com.hs.selectOne")
	private String selectOne;
	
	@Value("com.hs.insertData")
	private String insertData;
	
	@Value("com.hs.deleteData")
	private String deleteData;	
	
	@Value("com.hs.updateData")
	private String updateData;
	
	@Value("com.hs.selectAllCnt")
	private String selectAllCnt;
	
	@Value("com.hs.selectAllP")
	private String selectAllP;
	
	@Value("com.hs.updateReplyCntPlus")
	private String updateReplyCntPlus;
	
	@Value("com.hs.updateReplyCntMinus")
	private String updateReplyCntMinus;
	
	
	public List<BDto> selectAll(){
		return sqlSession.selectList(selectAll);
	}
	
	public BDto selectOne(int idx){
		return sqlSession.selectOne(selectOne, idx);
	}
	
	public int insertData(BDto dto){
		return sqlSession.insert(insertData, dto);
	}
	
	public int deleteData(BDto dto){
		return sqlSession.delete(deleteData, dto);
	}
	
	public int updateData(BDto dto){
		return sqlSession.update(updateData, dto);
	}
	
	public int selectAllCnt() {
		return sqlSession.selectOne(selectAllCnt);
	}
	
	public List<BDto> selectAllP(PagingVO vo){
		return sqlSession.selectList(selectAllP, vo);
	}
	
	public int updateReplyCntPlus(int idx){
		return sqlSession.update(updateReplyCntPlus, idx);
	}
	
	public int updateReplyCntMinus(int idx){
		return sqlSession.update(updateReplyCntMinus, idx);
	}
	
	
	
}
