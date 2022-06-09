package br.com.mangarate.mangarate.api.avaliacao.controllers;

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

import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoRequest;
import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoResponse;
import br.com.mangarate.mangarate.api.avaliacao.services.AvaliacaoService;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AvaliacaoResponse create(@RequestBody @Valid AvaliacaoRequest avaliacaoRequest) {

        return avaliacaoService.create(avaliacaoRequest);
    }

    @GetMapping
    public List<AvaliacaoResponse> findAll() {
        return avaliacaoService.findAll();
    }

}
