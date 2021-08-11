package com.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {

	@Value("${email}")
	String email;
	
	@Value("${checker}")
	String checker;
	
	
	@GetMapping("/content")
	public String sendingEmail() 
	{
		return email+"<br>"+checker;
	}
}
