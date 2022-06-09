package br.com.mangarate.mangarate.api.manga.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mangarate.mangarate.core.repositories.MangaRepository;

@Component
public class MangaExistsByIdValidator implements ConstraintValidator<MangaExistsById, Long> {

    @Autowired
    private MangaRepository mangaRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return mangaRepository.existsById(value);
    }

}
