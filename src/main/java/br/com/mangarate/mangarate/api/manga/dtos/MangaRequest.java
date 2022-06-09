package br.com.mangarate.mangarate.api.manga.dtos;

import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MangaRequest {
    
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 80)
    private String nome;

    @Lob
    @NotNull
    @NotEmpty
    @Size(min = 5, max = 800)
    private String resumo;

    @URL
    @NotNull
    @NotEmpty
    @Size (max= 255)
    private String capa;
}
