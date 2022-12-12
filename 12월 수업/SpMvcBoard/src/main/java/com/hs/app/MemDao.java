package com.hs.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MemDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Value("com.hs.selectMemAll")
	private String selectMemAll;
	
	@Value("com.hs.selectMemOne")
	private String selectMemOne;
	
	@Value("com.hs.selectMemCnt")
	private String selectMemCnt;
	
	@Value("com.hs.selectMemLoginCnt")
	private String selectMemLoginCnt;	
	
	@Value("com.hs.insertMem")
	private String insertMem;
	
	@Value("com.hs.deleteMem")
	private String deleteMem;
	
	@Value("com.hs.updateMem")
	private String updateMem;
	
	
	
	
	public List<MemDto> selectMemAll(){
		return sqlSession.selectList(selectMemAll);
	}
	
	public MemDto selectMemOne(String id){
		return sqlSession.selectOne(selectMemOne, id);
	}
	
	public int selectMemCnt(MemDto dto) {
		return sqlSession.selectOne(selectMemCnt, dto);
	}
	
	public int selectMemLoginCnt(MemDto dto) {
		return sqlSession.selectOne(selectMemLoginCnt, dto);
	}
	
	public int insertMem(MemDto dto){
		return sqlSession.insert(insertMem, dto);
	}
	
	public int deleteMem(String id){
		return sqlSession.delete(deleteMem, id);
	}
	
	public int updateMem(MemDto dto){
		return sqlSession.update(updateMem, dto);
	}
}
