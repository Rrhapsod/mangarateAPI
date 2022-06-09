package br.com.mangarate.mangarate.api.manga.mappers;

import org.springframework.stereotype.Component;

import br.com.mangarate.mangarate.api.manga.dtos.MangaRequest;
import br.com.mangarate.mangarate.api.manga.dtos.MangaResponse;
import br.com.mangarate.mangarate.core.models.Manga;

@Component
public class MangaMapper {

    public MangaResponse toResponse(Manga manga) {
        return MangaResponse.builder()
                .id(manga.getId())
                .nome(manga.getNome())
                .resumo(manga.getResumo())
                .capa(manga.getCapa())
                .build();
    }

    public Manga toModel(MangaRequest mangaRequest) {
        return Manga.builder()
                .nome(mangaRequest.getNome())
                .resumo(mangaRequest.getResumo())
                .capa(mangaRequest.getCapa())
                .build();
    }
}
