package com.example.demo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
@Service("restService")
public class RestService {

	@Inject
	private RestDAO restDAO;
	
	public List<UserVO> getAllUserInfo() {
		return restDAO.getAllUserInfo();
	}
	
	public UserVO getOneUserInfo(int id) {
		return restDAO.getOneUserInfo(id);	
	}
	
	public void insertUser(UserVO vo){
		restDAO.insertUser(vo);
	}
	
	public void deleteAllUserInfo(){
		restDAO.deleteAllUserInfo();
	}
	public void deleteOneUserInfo(int id) {
		restDAO.deleteOneUserInfo(id);
	}
	public void updateUser(UserVO vo) {
		restDAO.updateUser(vo);
	}

}
