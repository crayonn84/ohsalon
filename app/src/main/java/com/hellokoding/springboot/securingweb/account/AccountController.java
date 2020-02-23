package com.hellokoding.springboot.securingweb.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	AccountRepository accounts;
	
	@GetMapping("/create")
	public Account create() {
		Account account = new Account();
		account.setEmail("phades@naver.com");
		account.setPassword("password");
		
		return accounts.save(account); 
	}
}
