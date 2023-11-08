package com.BackEnd.PartieBackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Demande;
import com.BackEnd.PartieBackEnd.reposetory.DemandeReposetory;
@Service
public class DemandeServiceV1 implements DemandeService{
	@Autowired private DemandeReposetory repo;
	@Override
	public void createDemande(Demande demande) {
		// TODO Auto-generated method stub
		repo.save(demande);
	}

	@Override
	public List<Demande> getAllDemandes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Demande> getAllDemandesByCitoyenID(long citoyenid) {
		// TODO Auto-generated method stub
		return repo.findByCitoyenID(citoyenid);
	}

	@Override
	public Demande getDemandeById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public Demande updateDemande(long id, Demande demande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDemande(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	@Override
	public List<Demande> getAllDemandesRejeteByCitoyenID(long id){
		return null;
		
	}
}
