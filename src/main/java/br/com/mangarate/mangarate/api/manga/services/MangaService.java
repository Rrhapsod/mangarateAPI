package br.com.mangarate.mangarate.api.manga.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import br.com.mangarate.mangarate.api.manga.mappers.MangaMapper;
import br.com.mangarate.mangarate.core.repositories.MangaRepository;
import br.com.mangarate.mangarate.api.manga.dtos.MangaRequest;
import br.com.mangarate.mangarate.api.manga.dtos.MangaResponse;

@Service
public class MangaService {

    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private MangaMapper mangaMapper;

    public List<MangaResponse> findAll() {
        return mangaRepository.findAll()
                .stream()
                .map(mangaMapper::toResponse)
                .toList();
    }

    public MangaResponse create(MangaRequest mangaRequest) {
        var mangaToCreate = mangaMapper.toModel(mangaRequest);
        var createdManga = mangaRepository.save(mangaToCreate);
        return mangaMapper.toResponse(createdManga);
    }
}
