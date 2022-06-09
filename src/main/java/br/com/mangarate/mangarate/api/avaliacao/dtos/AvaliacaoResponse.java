package br.com.mangarate.mangarate.api.avaliacao.dtos;

import br.com.mangarate.mangarate.api.manga.dtos.MangaResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoResponse {

    private Long id;

    private String email;

    private Long nota;

    private MangaResponse manga;
    
}
