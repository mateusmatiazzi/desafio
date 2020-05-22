package com.example.desafioaz.servico;

import com.example.desafioaz.dominio.Proposta;
import com.example.desafioaz.repositorio.PropostaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaServico {

    @Autowired
    private PropostaRepositorio propostaRepositorio;
    
}
