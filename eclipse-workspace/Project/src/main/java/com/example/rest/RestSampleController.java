package com.example.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class RestSampleController {
	
	@Inject
	public RestService restService;
	
	
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<UserVO> getUserInfo(@RequestBody UserVO vo) {
		return restService.getUser(vo.id);
	}
	
	@RequestMapping(value="/users",method = RequestMethod.POST)
	public void insertUser(@RequestBody UserVO vo) {
		restService.insertUser(vo);
	}
	
	@RequestMapping(value="/users/{user}",method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody UserVO vo) {
		restService.deleteUser(vo.id);
	}
	
	@RequestMapping(value="/{users/{user}",method = RequestMethod.PUT)
	public void updateUser(@RequestBody UserVO vo) {
		restService.updateUser(vo);
	}
	

}
