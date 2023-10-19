package com.BackEnd.PartieBackEnd.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Demande {
	@Id	
	@GeneratedValue
	private long ID;
	@Column(nullable=false)
	private long IntermidaireID;
	@Column(nullable=false)
	private long citoyenID;
	@Column(nullable=false)
	private long AnnonceID;

}
