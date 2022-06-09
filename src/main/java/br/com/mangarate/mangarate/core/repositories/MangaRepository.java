package br.com.mangarate.mangarate.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mangarate.mangarate.core.exceptions.MangaNotFoundException;
import br.com.mangarate.mangarate.core.models.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> {

    default Manga findbyIdOrElseThrow(Long id) {

        return findById(id)
                .orElseThrow(MangaNotFoundException::new);
    }

}
