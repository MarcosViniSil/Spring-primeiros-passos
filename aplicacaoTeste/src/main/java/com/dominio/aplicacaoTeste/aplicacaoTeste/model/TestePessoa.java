package com.dominio.aplicacaoTeste.aplicacaoTeste.model;

import java.util.Date;

public class TestePessoa {
    public static boolean verificarData(Date data) {
        if (data.getYear() >= 1940 && data.getYear() <= 2022) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificarNome(String nome) {
        if (nome.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificarTelefone(String telefone) {
        try {
            int telefon = Integer.parseInt(telefone);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("numero ou formato invalido");
            return false;
        }
    }
    
    public static boolean verfificarReserva(Reserva reserva){
        if(reserva.getDataEntrada()!=null && reserva.getDataSaida()!=null){
            return true;
        }else{
            return false;
        }
    }
    
}
