package com.BackEnd.PartieBackEnd.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Justificatif {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String nom;
	@OneToOne
	private Utilisateur citoyen;
}
