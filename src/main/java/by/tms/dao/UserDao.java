package by.tms.dao;

import by.tms.entity.User;

public interface UserDao extends Dao<User> {
    User findByUsername(String username);
}
