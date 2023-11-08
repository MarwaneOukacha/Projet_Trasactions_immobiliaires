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

import com.BackEnd.PartieBackEnd.Entitys.Utilisateur;
import com.BackEnd.PartieBackEnd.services.UtilisateurService;
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {
	
	@Autowired	
    private UtilisateurService utilisateurService; 
    @PostMapping
    public void createUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurService.createUtilisateur(utilisateur);
    }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }
    
    @GetMapping()
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurService.getAllUtilisateur();
    }
    
    @PutMapping("/{id}")
    public void updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur updatedUtilisateur) {
        utilisateurService.updateUtilisateur(id, updatedUtilisateur);
    }

    // Endpoint pour supprimer un utilisateur par son ID
    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);
    }
}
