package by.tms.service;

import by.tms.dao.user.UserDao;
import by.tms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public void remove(long id) {
        userDao.remove(id);
    }
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Transactional(readOnly = true)
    public User findById(long id) {
        return userDao.findById(id);
    }
    @Transactional(readOnly = true)
    public Optional<User> findByUserName(String name) {
        return Optional.of(userDao.findByUsername(name));
    }
}
