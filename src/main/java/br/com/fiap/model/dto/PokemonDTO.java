package br.com.fiap.model.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PokemonDTO(

        @NotNull String nome,
        @NotNull @Positive Double altura,
        @NotNull @Positive Double peso,
        @NotNull String categoria,
        @PastOrPresent LocalDate dataDaCaptura,
        String urlImagem

) {
}
