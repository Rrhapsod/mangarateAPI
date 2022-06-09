package br.com.mangarate.mangarate.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class MangaNotFoundException extends EntityNotFoundException {
    
    public MangaNotFoundException(){
        super("Mangá não encontrado");
    }

    public MangaNotFoundException(String message){
        super(message);
    }
}
