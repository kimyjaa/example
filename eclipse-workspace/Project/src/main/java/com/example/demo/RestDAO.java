package com.example.demo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
@Repository("restDAO")
public class RestDAO {
	
	
	private static final String namespace = "userMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	public List<UserVO> getAllUserInfo() {
		return sqlSession.selectList(namespace+".getUserList");		
	}
	
	public UserVO getOneUserInfo(int id) {
		return (UserVO)sqlSession.selectOne(namespace+".getUser",id);
	}
	
	public void insertUser(UserVO vo) {
		sqlSession.insert(namespace+".insertUser",vo);
	}
	
	public void deleteAllUserInfo(){
		sqlSession.delete(namespace+".deleteAllUserInfo");
	}
	
	public void deleteOneUserInfo(int id){
		sqlSession.delete(namespace+".deleteOneUserInfo",id);
	}
	
	public void updateUser(UserVO vo) {
		sqlSession.update(namespace+".updateUser",vo);
	}


}
