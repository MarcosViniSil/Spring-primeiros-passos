package com.dominio.aplicacaoTeste.aplicacaoTeste.repository;

import com.dominio.aplicacaoTeste.aplicacaoTeste.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

}
