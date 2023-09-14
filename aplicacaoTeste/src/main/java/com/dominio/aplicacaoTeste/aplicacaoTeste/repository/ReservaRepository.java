package com.dominio.aplicacaoTeste.aplicacaoTeste.repository;


import com.dominio.aplicacaoTeste.aplicacaoTeste.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
