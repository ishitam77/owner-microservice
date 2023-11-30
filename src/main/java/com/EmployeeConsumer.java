package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="employees.com")
public interface EmployeeConsumer {
	
	@GetMapping("/hello")
	String getData();

}
