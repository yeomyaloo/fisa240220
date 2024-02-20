package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@GetMapping("getdata")
	public String get() {
		return "fisa update";
	}
	

}
