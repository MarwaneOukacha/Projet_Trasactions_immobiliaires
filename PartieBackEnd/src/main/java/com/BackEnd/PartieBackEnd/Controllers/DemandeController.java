package com.BackEnd.PartieBackEnd.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackEnd.PartieBackEnd.Entitys.Demande;
import com.BackEnd.PartieBackEnd.services.DemandeService;

@RestController
@RequestMapping("/demandes")
public class DemandeController {
	@Autowired
	private DemandeService demandeService;

	@PostMapping
	public void createDemande(@RequestBody Demande demande) {
		demandeService.createDemande(demande);
	}

	@GetMapping
	public List<Demande> getAllDemandes() {
		return demandeService.getAllDemandes();
	}

	@GetMapping("/citoyen/{citoyenid}")
	public List<Demande> getAllDemandesByCitoyenID(@PathVariable long citoyenid) {
		return demandeService.getAllDemandesByCitoyenID(citoyenid);
	}

	@GetMapping("/{id}")
	public Demande getDemandeById(@PathVariable long id) {
		return demandeService.getDemandeById(id);
	}

	@PutMapping("/{id}")
	public Demande updateDemande(@PathVariable long id, @RequestBody Demande demande) {
		return demandeService.updateDemande(id, demande);
	}

	@DeleteMapping("/{id}")
	public void deleteDemande(@PathVariable long id) {
		demandeService.deleteDemande(id);
	}
}
