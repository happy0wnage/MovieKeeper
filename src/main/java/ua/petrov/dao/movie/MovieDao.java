package ua.petrov.dao.movie;

import org.springframework.stereotype.Repository;
import ua.petrov.core.model.Movie;

import java.util.List;
@Repository
public interface MovieDao {

    List<Movie> getAll();

    Movie get(int id);

    void delete(int id);

    void insert(Movie movie);

    void update(Movie movie);
}
