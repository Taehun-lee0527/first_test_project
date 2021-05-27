package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value= {"/", "hello"})
	public String welcome() {
		return "hello";
	}
}
