package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Annonce {
	@Id
	@GeneratedValue
	private long id;
	@OneToOne
	@Column
	private Utilisateur intermidiaire;
	@OneToOne
	@Column
	private Utilisateur citoyen;
	@Column(nullable=false)
	private Date date_annnonce;
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private String motif;
	@Column(nullable=false)
	private int delai;
	@Column(nullable=false)
	private String photo;
	@Column(nullable=false)
	private String type_operation;
	@Column(nullable=false)
	private String type_Bien;
	@Column(nullable=false)
	private Double Surface_Bien;
	@Column(nullable=false)
	private Double PrixBien;
	@Column(nullable=false)
	private String Description;
	@OneToMany
	private List<Justificatif> Justif;
	
}
