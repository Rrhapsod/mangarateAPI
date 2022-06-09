package br.com.mangarate.mangarate.api.avaliacao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoRequest;
import br.com.mangarate.mangarate.api.avaliacao.dtos.AvaliacaoResponse;
import br.com.mangarate.mangarate.api.avaliacao.mappers.AvaliacaoMapper;
import br.com.mangarate.mangarate.core.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private AvaliacaoMapper avaliacaoMapper;

    public AvaliacaoResponse create(AvaliacaoRequest avaliacaoRequest) {
        var avaliacaoToCreate = avaliacaoMapper.toModel(avaliacaoRequest);
        var createAvaliacao = avaliacaoRepository.save(avaliacaoToCreate);
        return avaliacaoMapper.toResponse(createAvaliacao);
    }

    public List<AvaliacaoResponse> findAll() {
        return avaliacaoRepository.findAll()
                .stream()
                .map(avaliacaoMapper::toResponse)
                .toList();
    }
}
