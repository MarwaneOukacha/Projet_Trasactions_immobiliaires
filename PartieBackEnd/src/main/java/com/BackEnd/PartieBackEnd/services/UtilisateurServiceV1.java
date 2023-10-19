package com.BackEnd.PartieBackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Utilisateur;
import com.BackEnd.PartieBackEnd.reposetory.UtilisateurReposetory;

@Service
public class UtilisateurServiceV1 implements UtilisateurService{
	@Autowired private UtilisateurReposetory repo;
	@Override
	public Utilisateur getUtilisateurById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void createUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
		repo.save(utilisateur);
	}

	@Override
	public void updateUtilisateur(Long id, Utilisateur updatedUtilisateur) {
		// TODO Auto-generated method stub
		Utilisateur ut=repo.findById(id).get();
		if (updatedUtilisateur.getEmail() != null && !updatedUtilisateur.getEmail().isEmpty()) {
            ut.setEmail(updatedUtilisateur.getEmail());
        }

        if (updatedUtilisateur.getNumero_telephone() != null && !updatedUtilisateur.getNumero_telephone().isEmpty()) {
            ut.setNumero_telephone(updatedUtilisateur.getNumero_telephone());
        }

        if (updatedUtilisateur.getNom() != null && !updatedUtilisateur.getNom().isEmpty()) {
            ut.setNom(updatedUtilisateur.getNom());
        }

        if (updatedUtilisateur.getPassword() != null && !updatedUtilisateur.getPassword().isEmpty()) {
            ut.setPassword(updatedUtilisateur.getPassword());
        }
        if (updatedUtilisateur.getPrenom() != null && updatedUtilisateur.getPrenom().isEmpty()) {
            ut.setPrenom(updatedUtilisateur.getPrenom());
        } 
        repo.save(ut);
	}

	@Override
	public void deleteUtilisateur(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
