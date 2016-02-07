package ua.petrov.service.user;

import org.springframework.stereotype.Service;
import ua.petrov.core.model.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();

    User get(int id);

    void delete(int id);

    void insert(User user);

    void update(User user);

}
