package ua.petrov.dao.user;

import org.springframework.stereotype.Repository;
import ua.petrov.core.model.User;

import java.util.List;
@Repository
public interface UserDao {

    List<User> getAll();

    User get(int id);

    void delete(int id);

    void insert(User user);

    void update(User user);
}
