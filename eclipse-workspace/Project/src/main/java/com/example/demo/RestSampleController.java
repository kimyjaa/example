package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestSampleController {
	
	@Inject
	public RestService restService;
	

	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<UserVO> getAllUserInfo() {
		return restService.getAllUserInfo();
	}
	
	@RequestMapping(value="/users/{id}",method = RequestMethod.GET)
	public UserVO geOneUserInfo(@PathVariable("id") int id) {
		return restService.getOneUserInfo(id);
	}

	@RequestMapping(value="/users",method = RequestMethod.POST)
	public void insertUser(@ModelAttribute UserVO vo ) {
		System.out.println("abcaaqweqwe");
		restService.insertUser(vo);
	}
	
	@RequestMapping(value="/users",method = RequestMethod.DELETE)
	public void deleteAllUserInfo() {
		restService.deleteAllUserInfo();
	}
	
	@RequestMapping(value="/users/{id}",method = RequestMethod.DELETE)
	public void deleteOneUserInfo(@PathVariable("id") int id) {
		restService.deleteOneUserInfo(id);
	}
	
	@RequestMapping(value="/users",method = RequestMethod.PUT)
	public void updateUser(@ModelAttribute UserVO vo) {
		restService.updateUser(vo);
	}
	

}
