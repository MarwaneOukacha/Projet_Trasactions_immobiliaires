package com.BackEnd.PartieBackEnd.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.AuthenticationManager;

import com.BackEnd.PartieBackEnd.Models.AuthRequest;

@RestController
public class AuthentificationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@PostMapping("/login")
	public String login(@RequestBody AuthRequest authRequest) {
		Authentication authenticate;
		authenticate = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
		if (authenticate.isAuthenticated()) {
			return null;
		} else {
			throw new RuntimeException("invalid access");
		}
	}
}
