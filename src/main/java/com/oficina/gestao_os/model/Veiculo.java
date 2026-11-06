package com.oficina.gestao_os.model;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 10)
    private String matricula;

    @Column(nullable = false, length = 100)
    private String marcaModelo;

    @Column(length = 100)
    private String clienteReferencia;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getMarcaModelo() { return marcaModelo; }
    public void setMarcaModelo(String marcaModelo) { this.marcaModelo = marcaModelo; }
    public String getClienteReferencia() { return clienteReferencia; }
    public void setClienteReferencia(String clienteReferencia) { this.clienteReferencia = clienteReferencia; }
}