package ua.petrov.dao.series;

import org.springframework.stereotype.Repository;
import ua.petrov.core.model.Series;

import java.util.List;
@Repository
public interface SeriesDao {

    List<Series> getAll();

    Series get(int id);

    void delete(int id);

    void insert(Series series);

    void update(Series series);
}
