package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BackEnd.PartieBackEnd.Entitys.Justificatif;
@Repository
public interface JustificatifReposetory extends JpaRepository<Justificatif, Long>{
	
}
