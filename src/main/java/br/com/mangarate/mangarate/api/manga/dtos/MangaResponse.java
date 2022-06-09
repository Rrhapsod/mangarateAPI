package br.com.mangarate.mangarate.api.manga.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MangaResponse {

    private Long id;

    private String nome;

    private String resumo;

    private String capa;
}
