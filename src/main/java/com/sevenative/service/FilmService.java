package com.sevenative.service;

import com.sevenative.entity.Film;
import java.util.List;

public interface FilmService {

    public Film create(Film smartphone);

    public Film get(int id);

    public Film update(Film product);

    public Film delete(int id);

    public List getAll();

}
