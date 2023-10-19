package com.BackEnd.PartieBackEnd.services;

import com.BackEnd.PartieBackEnd.Entitys.Utilisateur;

public interface UtilisateurService {

	public Utilisateur getUtilisateurById(Long id);

	public void createUtilisateur(Utilisateur utilisateur);

	public void updateUtilisateur(Long id, Utilisateur updatedUtilisateur);

	public void deleteUtilisateur(Long id);
}
