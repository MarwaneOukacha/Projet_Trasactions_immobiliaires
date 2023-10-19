package com.BackEnd.PartieBackEnd.services;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.BackEnd.PartieBackEnd.Entitys.Annonce;
import com.BackEnd.PartieBackEnd.reposetory.AnnonceReposetory;

@Service
public class AnnonceServiceV1 implements AnnonceService{
	@Autowired private AnnonceReposetory repo;
	private  String alphabet="0123456789AZERTYUIOPQSDFGHJKLMWXCVBNazertyuiopqsdfghjklmwxcvbn";
	private  Random ran=new SecureRandom();
	@Override
	public void ajouterAnnonce(Annonce ann) {
		repo.save(ann);
	}
	@Override
	public List<Annonce> getAllAnnonces() {
		return repo.findAll();
	}
	@Override
	public void SupprimerAnnonce(long id) {
		repo.deleteById(id);
		
	}
	public String GenererId(int length) {
		StringBuilder returnValue=new StringBuilder(length);
		for(int i=0;i<length;i++) {
			returnValue.append(alphabet.charAt(ran.nextInt(alphabet.length())));
		}
		return new String(returnValue);
	}
	@Override
	public void modifier(long id, Annonce a) {
		Optional<Annonce> ann = repo.findById(id);
		Annonce an=ann.get();

        if (a.getDescription() != null && !a.getDescription().isEmpty()) {
            an.setDescription(an.getDescription());
        }

        if (a.getMotif() != null && !a.getMotif().isEmpty()) {
            an.setMotif(a.getMotif());
        }

        if (a.getPhoto() != null && !a.getPhoto().isEmpty()) {
            an.setPhoto(a.getPhoto());
        }

        if (a.getStatus() != null && !a.getStatus().isEmpty()) {
            an.setStatus(a.getStatus());
        }
        if (a.getPrixBien() != null && a.getPrixBien() !=0) {
            an.setPrixBien(a.getPrixBien());
        }
        if (a.getSurface_Bien() != null && a.getSurface_Bien() !=0) {
            an.setSurface_Bien(a.getSurface_Bien());
        }
        if (a.getType_Bien() != null && a.getType_Bien().isEmpty()) {
            an.setType_Bien(a.getType_Bien());
        }
        if (a.getType_operation() != null && a.getType_operation().isEmpty()) {
            an.setType_Bien(a.getType_Bien());
        }
        repo.save(an);
	}

}
