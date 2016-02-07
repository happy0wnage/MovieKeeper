package ua.petrov.service.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.petrov.core.model.Movie;
import ua.petrov.dao.movie.MovieDao;

import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    public List<Movie> getAll() {
        return movieDao.getAll();
    }

    public Movie get(int id) {
        return movieDao.get(id);
    }

    public void delete(int id) {
        movieDao.delete(id);
    }

    public void insert(Movie movie) {
        movieDao.insert(movie);
    }

    public void update(Movie movie) {
        movieDao.update(movie);
    }
}
