package web.service;

import java.util.List;
import web.model.User;

public interface UserService {
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUser(int id);

    List<User> getUsers();


}
