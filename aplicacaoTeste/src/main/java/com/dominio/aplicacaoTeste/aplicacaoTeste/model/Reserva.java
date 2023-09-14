package com.dominio.aplicacaoTeste.aplicacaoTeste.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id_reserva;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataEntrada;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataSaida;

    @OneToOne
    @JoinColumn(name = "Pessoa_id")
    private Pessoa pessoa;


    public Reserva() {
    }

    public Reserva(Date dataEntrada, Date dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Long getId_reserva() {
        return id_reserva;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return ""+dataEntrada;
    }
}
