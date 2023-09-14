package com.dominio.aplicacaoTeste.aplicacaoTeste.model;



import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class TesteReserva {

    public static boolean verificarDataEntrada(Date entrada){
        LocalDate dataEntrada = entrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int compararData = dataEntrada.compareTo(LocalDate.now());

        if(compararData>=0){
          return true;
        }else{
            return false;
        }
    }

    public static boolean verificarDataSaida(Date entrada,Date saida){
        if(saida.after(entrada)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean verificarPessoa(Pessoa pessoa){
        if(pessoa.getDataNascimento()!=null && pessoa.getNome()!=null && pessoa.getTelefone()!=null){
            return true;
        }else{
            return false;
        }
    }


}
