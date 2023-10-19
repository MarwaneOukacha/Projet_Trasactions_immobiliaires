package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackEnd.PartieBackEnd.Entitys.Demande;

public interface DemandeReposetory extends JpaRepository<Demande, Long>{

}
