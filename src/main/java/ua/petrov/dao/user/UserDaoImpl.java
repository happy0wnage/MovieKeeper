package ua.petrov.dao.user;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.petrov.core.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Criteria criteria =  getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }

    public User get(int id) {
        return (User) getCurrentSession().get(User.class, id);
    }

    public void delete(int id) {
        User user = get(id);
        if (user != null)
            getCurrentSession().delete(user);
    }

    public void insert(User user) {
        getCurrentSession().persist(user);
    }

    public void update(User user) {
        getCurrentSession().update(user);
    }

}
