package com.mincho.MinchJuice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mincho.MinchJuice.logic.Toyblog;

@Repository
public class ToyblogDAO {
	
	@Autowired
	public SqlSession sqlSession;
	public List<Toyblog> getToyblogList(){
		System.out.println("==================================================");
		return sqlSession.selectList("getToyblogList");
		
	}
	
	

}
