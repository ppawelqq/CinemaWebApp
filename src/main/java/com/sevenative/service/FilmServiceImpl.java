package com.sevenative.service;

import com.sevenative.entity.Film;
import com.sevenative.repositories.FilmRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmServiceImpl {

    @Autowired
    private FilmRepository filmRepository;

    public Film create(Film product) {
        return filmRepository.save(product);
    }

    public Film get(int id) {
        return filmRepository.findOne(id);
    }

    public Film update(Film product) {
        Film productToUpdate = get(product.getId());
        if (productToUpdate != null) {
            productToUpdate.setName(product.getName());
            productToUpdate.setPrice(product.getPrice());
            return filmRepository.save(product);
        }
        return null;
    }

    public Film delete(int id) {
        Film productToDelete = get(id);
        if (productToDelete != null) {
            filmRepository.delete(id);
            return productToDelete;
        }
        return null;
    }

    public List getAll() {
        return filmRepository.findAll();
    }

}
