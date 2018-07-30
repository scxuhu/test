package com.panshi.test;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.panshi.domain.User;

@FeignClient("TESTSERVICE")
public interface FeignClients {

	@GetMapping("/hellow")
	public String hellow();
	@GetMapping("/user")
	public List<User> findUser();
}
