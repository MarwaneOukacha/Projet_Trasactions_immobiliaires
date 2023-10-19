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
