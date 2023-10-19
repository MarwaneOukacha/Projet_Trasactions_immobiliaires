package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BackEnd.PartieBackEnd.Entitys.commun;

@Repository
public interface CommunReposetory extends JpaRepository<commun, Long>{

}
