package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BackEnd.PartieBackEnd.Entitys.Demande;
import java.util.List;


public interface DemandeReposetory extends JpaRepository<Demande, Long>{
	List<Demande> findByCitoyenID(long citoyenID);
}
