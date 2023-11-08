package com.BackEnd.PartieBackEnd.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackEnd.PartieBackEnd.Entitys.Annonce;
import com.BackEnd.PartieBackEnd.services.AnnonceService;

@RestController
@RequestMapping("/annonce")
public class AnnonceController {
	@Autowired private AnnonceService service;
	@PostMapping
	public void CreeAnnonce(@RequestBody Annonce ann) {
		service.ajouterAnnonce(ann);
	}
	@PutMapping("/{id}")
	public void ModifierAnnonce(@PathVariable long id,@RequestBody Annonce a) {
		service.modifier(id,a);
	}
	@DeleteMapping("/{id}")
	public void SupprimerAnnonce(@PathVariable long id) {
		service.SupprimerAnnonce(id);
	}
	@GetMapping
	public List<Annonce> GetAllAnnonce() {
		return service.getAllAnnonces();
	}
	@GetMapping("/reserve/intermédiaire/{intermidiaireID}")
	public List<Annonce> GetAllAnnonceReserverInterm(@PathVariable long intermidiaireID) {
		return service.getAllAnnoncesReserveIntermediaire(intermidiaireID);
	}
	
	@PostMapping("/reserve/{IntermID}")
	public void ReserverAnnonce(@PathVariable long IntermID,long AnnonceID){
		service.ReserverUneAnnonce(IntermID,AnnonceID);
	}
	@PostMapping("/libirer/{AnnonceID}")
	public void LibirerAnnonce(@PathVariable long AnnonceID){
		service.LibirerAnnonce(AnnonceID);
	}
}

