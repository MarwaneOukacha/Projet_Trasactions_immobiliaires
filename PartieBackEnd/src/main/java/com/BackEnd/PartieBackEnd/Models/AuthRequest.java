package com.BackEnd.PartieBackEnd.Models;

import lombok.Data;

@Data
public class AuthRequest {
	private String email;
	private String password;
}
