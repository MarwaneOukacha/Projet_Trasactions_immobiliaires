package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Justificatif {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String nom;
	private long idAnnonce;
}
