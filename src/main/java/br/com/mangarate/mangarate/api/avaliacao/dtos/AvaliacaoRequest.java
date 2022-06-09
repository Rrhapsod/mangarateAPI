package br.com.mangarate.mangarate.api.avaliacao.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import br.com.mangarate.mangarate.api.manga.validators.MangaExistsById;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class AvaliacaoRequest {
    
    @Email
    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String email;

    @NotNull
    @Min(0)
    @Max(10)
    private Long nota;

    @NotNull
    @Positive
    @MangaExistsById
    private Long mangaId;
}
