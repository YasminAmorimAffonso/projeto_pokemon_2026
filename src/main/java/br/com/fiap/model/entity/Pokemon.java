package br.com.fiap.model.entity;


import br.com.fiap.model.dto.PokemonDTO;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Pokemon")
@Table(name = "dddj_pokemon")

public class Pokemon {

    // atributos

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long codigo;
    private String nome;
    private Double altura;
    private Double peso;
    private String categoria;
    private LocalDate dataDaCaptura;
    private String urlImagem;


    // Construtor Vazio

    public Pokemon() {}

    // Construtor com parâmetro usando Record

    public Pokemon(PokemonDTO pokemonDTO) {

        this.nome = pokemonDTO.nome();
        this.altura = pokemonDTO.altura();
        this.peso = pokemonDTO.peso();
        this.categoria = pokemonDTO.categoria();
        this.dataDaCaptura = pokemonDTO.dataDaCaptura();
        this.urlImagem = pokemonDTO.urlImagem();

    }

    // métodos getters e setters


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataDaCaptura() {
        return dataDaCaptura;
    }

    public void setDataDaCaptura(LocalDate dataDaCaptura) {
        this.dataDaCaptura = dataDaCaptura;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }





}
