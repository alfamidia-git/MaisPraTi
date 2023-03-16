package com.maisprati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maisprati.model.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer>{

}
