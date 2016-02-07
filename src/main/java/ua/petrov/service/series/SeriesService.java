package ua.petrov.service.series;

import org.springframework.stereotype.Service;
import ua.petrov.core.model.Series;

import java.util.List;

@Service
public interface SeriesService {

    List<Series> getAll();

    Series get(int id);

    void delete(int id);

    void insert(Series series);

    void update(Series series);
}
