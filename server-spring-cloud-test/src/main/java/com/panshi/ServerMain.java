package com.panshi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerMain {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerMain.class).web(true).run(args);
	}
}
