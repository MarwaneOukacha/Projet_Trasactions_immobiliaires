package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
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
	@Column()
	private String IME;

}
