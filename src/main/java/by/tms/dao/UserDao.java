package by.tms.dao;

import by.tms.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao {
    @Transactional
    void save(User user);
}
