package com.jit4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit4.model.MemberProfileConfiguration;
@RestController
public class ProfileController {
	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;	
	
	@RequestMapping("/profile")
	public MemberProfileConfiguration getConfig() {
		return memberProfileConfiguration;
	}

}
