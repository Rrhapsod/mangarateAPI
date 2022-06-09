package br.com.mangarate.mangarate.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mangarate.mangarate.core.models.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
}
