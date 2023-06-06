package by.tms.dao.user;

import by.tms.dao.Dao;
import by.tms.entity.User;

public interface UserDao extends Dao<User> {
    User findByUsername(String username);
}
