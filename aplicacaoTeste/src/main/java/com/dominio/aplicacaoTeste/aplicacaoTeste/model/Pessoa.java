package com.dominio.aplicacaoTeste.aplicacaoTeste.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_Pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pessoa")
    private Long id_pessoa;
    @Column(length = 50, nullable = false)
    private String nome;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataNascimento;
    @Column(length = 50, nullable = false)
    private String telefone;

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Reserva reserva;


    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNascimento, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Long getId_pessoa() {
        return id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome;
    }



}
