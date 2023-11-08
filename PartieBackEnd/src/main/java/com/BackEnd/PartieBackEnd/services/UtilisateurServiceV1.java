package com.BackEnd.PartieBackEnd.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Utilisateur;
import com.BackEnd.PartieBackEnd.reposetory.UtilisateurReposetory;

@Service
public class UtilisateurServiceV1 implements UtilisateurService,UserDetailsService{
	@Autowired private UtilisateurReposetory repo;
	@Autowired private PasswordEncoder password;
	@Override
	public Utilisateur getUtilisateurById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void createUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateur.setPassword(password.encode(utilisateur.getPassword()));
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

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Utilisateur credential=repo.findByEmail(email).get(0);
		if (credential == null) {
	        throw new UsernameNotFoundException("Utilisateur non trouvé avec le nom d'utilisateur : " + email);
	    }
        UserDetails Useer=new User(credential.getEmail(),credential.getPassword(),new ArrayList<>());
        return Useer;
	}

}
