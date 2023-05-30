package by.tms.service;

import by.tms.dao.HibernateUserDao;
import by.tms.dao.UserDao;
import by.tms.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao = new HibernateUserDao();

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    public void remove(long id) {
        userDao.remove(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(long id) {
        return userDao.findById(id);
    }

    public User findByProductName(String name) {
        return userDao.findByUsername(name);
    }
}
