package com.dominio.aplicacaoTeste.aplicacaoTeste;


import com.dominio.aplicacaoTeste.aplicacaoTeste.model.Pessoa;
import com.dominio.aplicacaoTeste.aplicacaoTeste.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.dominio.aplicacaoTeste.aplicacaoTeste.repository.PessoaRepository;
import com.dominio.aplicacaoTeste.aplicacaoTeste.repository.ReservaRepository;

import java.sql.Date;

@Component
public class AppTeste implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa =new Pessoa();
        Date dataParaBanco = Date.valueOf("2006-08-13");

        pessoa.setNome("iasbelle");
        pessoa.setDataNascimento(dataParaBanco);
        pessoa.setTelefone("3198989898");

        Reserva reserva =new Reserva();
        Date entrada = Date.valueOf("2024-09-18");
        Date saida = Date.valueOf("2024-09-25");
        reserva.setDataEntrada(entrada);
        reserva.setDataSaida(saida);
        reserva.setPessoa(pessoa);

        pessoa.setReserva(reserva);

        pessoaRepository.save(pessoa);
        reservaRepository.save(reserva);

        for(Pessoa a: pessoaRepository.findAll()){
            System.out.println(a);
        }

        for(Reserva b: reservaRepository.findAll()){
            System.out.println(b);
        }

    }
}
