package com.BackEnd.PartieBackEnd.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BackEnd.PartieBackEnd.Entitys.Annonce;
import java.util.List;
import java.util.Optional;


@Repository
public interface AnnonceReposetory extends JpaRepository<Annonce, Long>{
}
