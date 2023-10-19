package com.BackEnd.PartieBackEnd.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue
	private long ID;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String numero_telephone;
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String IME;

}
