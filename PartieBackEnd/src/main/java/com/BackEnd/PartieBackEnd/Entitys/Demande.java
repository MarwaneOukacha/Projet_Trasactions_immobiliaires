package com.BackEnd.PartieBackEnd.Entitys;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	private long IntermidaireID;
	@Column(nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	private long citoyenID;
	@Column(nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	private long AnnonceID;

}
