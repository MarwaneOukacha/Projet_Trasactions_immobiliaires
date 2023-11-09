package com.BackEnd.PartieBackEnd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Demande;

@Service
public interface DemandeService {

	void createDemande(Demande demande);

	List<Demande> getAllDemandes();

	List<Demande> getAllDemandesByCitoyenID(long citoyenid);

	Demande getDemandeById(long id);

	Demande updateDemande(long id, Demande demande);

	void deleteDemande(long id);
	
	public List<Demande> getALLDemandeByIME(String IME);
	
	public List<Demande> getAllDemandesRejeteByCitoyenID(long id);
}
