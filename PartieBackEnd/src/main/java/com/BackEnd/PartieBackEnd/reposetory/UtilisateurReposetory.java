package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BackEnd.PartieBackEnd.Entitys.Utilisateur;
@Repository
public interface UtilisateurReposetory extends JpaRepository<Utilisateur, Long>{

}
