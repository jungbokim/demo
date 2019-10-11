package kr.ac.tu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.tu.demo.comm.ICommController;

@RestController
public class TestController implements ICommController {

	@Override
	@GetMapping("/name/20191011")
	public String getName() {
		return "두기";
	}

	@Override
	@GetMapping("/dept/20191011")
	public String getDept() {
		return "코드팜";
	}

	@Override
	@GetMapping("/age/20191011")
	public String getAge() {
		return "38";
	}

}
