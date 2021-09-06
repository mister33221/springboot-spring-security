package com.abc.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//注意controller資料夾位置 否則會導致讀取不到
//RestController 跟 controller 的差別?
@RestController
public class controller {

	
	@GetMapping(value = "/")
	public String demo() {
		System.out.println("in controller");
		return "My first spring boot + spring security demo!";
	}
}
