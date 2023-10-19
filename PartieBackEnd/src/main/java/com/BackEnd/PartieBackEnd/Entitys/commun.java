package com.BackEnd.PartieBackEnd.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class commun {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String nom; 
}
