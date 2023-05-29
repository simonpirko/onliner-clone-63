package by.tms.dao;

import by.tms.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Component
public class HibernateUserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private static final String FIND_BY_USERNAME = "from User where username = :username";
    private static final String USERNAME = "username";


    @Transactional
    public void save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }

    public Optional<User> findByUsername(String username) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery(FIND_BY_USERNAME);
        query.setParameter(USERNAME, username);
        User singleResult = query.getSingleResult();
        return Optional.of(singleResult);
    }

}
