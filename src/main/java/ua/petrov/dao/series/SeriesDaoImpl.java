package ua.petrov.dao.series;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.petrov.core.model.Movie;
import ua.petrov.core.model.Series;

import java.util.List;

@Repository
public class SeriesDaoImpl implements SeriesDao{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Series> getAll() {
        Criteria criteria =  getCurrentSession().createCriteria(Series.class);
        return criteria.list();
    }

    public Series get(int id) {
        return (Series) getCurrentSession().get(Series.class, id);
    }

    public void delete(int id) {
        Series series = get(id);
        if (series != null)
            getCurrentSession().delete(series);
    }

    public void insert(Series series) {
        getCurrentSession().persist(series);
    }

    public void update(Series series) {
        getCurrentSession().update(series);
    }
}
