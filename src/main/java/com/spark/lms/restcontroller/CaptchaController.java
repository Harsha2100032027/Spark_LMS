package com.spark.lms.restcontroller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spark.lms.service.captchaService;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

	@Autowired
	captchaService cs;
	
	@GetMapping("/cap/{length}")
	public String cap(@PathVariable("length") int length) {
		String txt= cs.randomText(length);
		return Base64.getEncoder().encodeToString(cs.getCaptcha(txt));
		
	}
	@GetMapping("/validate/{txt}")
	 public String validate(@PathVariable("txt") String txt)
	 {
	  return cs.validateCaptcha(txt);
	 }

}
