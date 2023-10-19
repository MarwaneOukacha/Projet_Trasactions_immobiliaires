package com.BackEnd.PartieBackEnd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Annonce;

@Service
public interface AnnonceService {

	void ajouterAnnonce(Annonce ann);
	List<Annonce> getAllAnnonces();
	void SupprimerAnnonce(long id);
	void modifier(long id, Annonce a);
}
