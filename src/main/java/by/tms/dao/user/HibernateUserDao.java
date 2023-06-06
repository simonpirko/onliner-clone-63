package by.tms.dao.user;

import by.tms.dao.user.UserDao;
import by.tms.entity.Product;
import by.tms.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateUserDao implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private final static String DELETE_BY_ID = "delete from User u where u.id = :id";
    private final static String FIND_ALL = "select u from User u";
    private final static String FIND_BY_NAME = "select u from User u where u.username = :username";
    private static final String ID = "id";
    private static final String USERNAME = "username";

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void remove(long id) {
        sessionFactory.getCurrentSession()
                .createQuery(DELETE_BY_ID, Product.class)
                .setParameter(ID, id)
                .executeUpdate();
    }

    @Override
    public List<User> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery(FIND_ALL, User.class)
                .getResultList();
    }

    @Override
    public User findById(long id) {
        return sessionFactory.getCurrentSession()
                .get(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery(FIND_BY_NAME, User.class)
                .setParameter(USERNAME, username)
                .getSingleResult();
    }
}
