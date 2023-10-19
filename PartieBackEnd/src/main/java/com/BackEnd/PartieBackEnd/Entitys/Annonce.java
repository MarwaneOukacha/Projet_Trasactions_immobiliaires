package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Annonce {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private long intermidiaireID;
	@Column(nullable=false)
	private long citoyenId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
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
	@Column()
	private String AnnonceId;
	
}
