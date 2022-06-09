package br.com.mangarate.mangarate.api.avaliacao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoRequest;
import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoResponse;
import br.com.mangarate.mangarate.api.manga.mappers.MangaMapper;
import br.com.mangarate.mangarate.core.models.Avaliacao;
import br.com.mangarate.mangarate.core.repositories.MangaRepository;

@Component
public class AvaliacaoMapper {

    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private MangaMapper mangaMapper;

    public Avaliacao toModel(AvaliacaoRequest avaliacaoRequest) {

        return Avaliacao.builder()
                .email(avaliacaoRequest.getEmail())
                .nota(avaliacaoRequest.getNota())
                .manga(mangaRepository.findbyIdOrElseThrow(avaliacaoRequest.getMangaId()))
                .build();
    }

    public AvaliacaoResponse toResponse(Avaliacao avaliacao) {

        return AvaliacaoResponse.builder()
                .id(avaliacao.getId())
                .email(avaliacao.getEmail())
                .nota(avaliacao.getNota())
                .manga(mangaMapper.toResponse(avaliacao.getManga()))
                .build();
    }

}
