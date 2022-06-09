package br.com.mangarate.mangarate.api.manga.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mangarate.mangarate.api.manga.dtos.MangaRequest;
import br.com.mangarate.mangarate.api.manga.dtos.MangaResponse;
import br.com.mangarate.mangarate.api.manga.services.MangaService;

@RestController
@RequestMapping("/api/mangas")
public class MangaController {

    @Autowired
    private MangaService mangaService;

    @GetMapping
    public List<MangaResponse> findAll() {
        return mangaService.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public MangaResponse create(@RequestBody @Valid MangaRequest mangaRequest) {
        return mangaService.create(mangaRequest);
    }

}
