package ua.petrov.service.movie;

import org.springframework.stereotype.Service;
import ua.petrov.core.model.Movie;

import java.util.List;

@Service
public interface MovieService {

    List<Movie> getAll();

    Movie get(int id);

    void delete(int id);

    void insert(Movie movie);

    void update(Movie movie);

}
