package com.example.rest;

import java.util.List;

import javax.inject.Inject;

public class RestService {

	
	private RestDAO restDAO;
	
	public List<UserVO> getUser(int id) {
		
		if( id == 0 ) {
			return restDAO.getUserList();
		}
		else {
			return (List<UserVO>) restDAO.getUser(id);
		}
	}
	
	public void insertUser(UserVO vo){
		restDAO.insertUser(vo);
	}
	
	public void deleteUser(int id){
		restDAO.deleteUser(id);
	}
	public void updateUser(UserVO vo) {
		restDAO.updateUser(vo);
	}

}
