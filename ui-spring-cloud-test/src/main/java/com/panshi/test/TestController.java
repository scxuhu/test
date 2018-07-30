package com.panshi.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.panshi.domain.RespEntity;
import com.panshi.domain.User;


@RestController
public class TestController {

	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private FeignClients feig;
	
	@GetMapping("/hellow")
	private String hellow() {
		/*String url="http://TESTSERVICE/hellow";
		ResponseEntity<String> str= rest.getForEntity(url, String.class);
		return str.getBody();*/
		return feig.hellow();
	}
	@GetMapping("/user")
	public RespEntity findUser(int limit,int page) {
		RespEntity resp=new RespEntity();
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setCity("永州");
		user.setId("1");
		user.setSex("男");
		user.setUsername("xxxxxxxxxx");
		for (int i = 0; i < 10; i++) {
			list.add(user);
			list.add(user);
		}
		resp.setCount(limit);
		
		resp.setData(list);
		return resp;
	}
	
}
