package com.example.desafioaz.repositorio;

import com.example.desafioaz.dominio.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepositorio extends CrudRepository <Proposta, Long> {
}
