package ua.petrov.service.series;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.petrov.core.model.Series;
import ua.petrov.dao.series.SeriesDao;

import java.util.List;

@Service
@Transactional
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesDao seriesDao;

    public List<Series> getAll() {
        return seriesDao.getAll();
    }

    public Series get(int id) {
        return seriesDao.get(id);
    }

    public void delete(int id) {
        seriesDao.delete(id);
    }

    public void insert(Series series) {
        seriesDao.insert(series);
    }

    public void update(Series series) {
        seriesDao.update(series);
    }
}
