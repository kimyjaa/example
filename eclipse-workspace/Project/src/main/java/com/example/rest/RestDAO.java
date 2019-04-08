package com.example.rest;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class RestDAO {
	
	
	private static final String namespace = "userMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	public UserVO getUser(int id) {
		return (UserVO)sqlSession.selectOne(namespace+".getUser",id);
	}
	
	public List<UserVO> getUserList() {
		return sqlSession.selectList(namespace+".getUserList");		
	}
	
	public void insertUser(UserVO vo) {
		sqlSession.insert(namespace+".insertUser",vo);
	}
	
	public void deleteUser(int id){
		sqlSession.delete(namespace+".deleteUser",id);
	}
	public void updateUser(UserVO vo) {
		sqlSession.update(namespace+".updateUser",vo);
	}


}
