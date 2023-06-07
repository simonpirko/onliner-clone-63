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
    private static final String ID = "id";
    private static final String USERNAME = "username";

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void remove(long id) {
        sessionFactory.getCurrentSession()
                .getNamedQuery("User.remove")
                .setParameter(ID, id)
                .executeUpdate();
    }

    @Override
    public List<User> findAll() {
        return sessionFactory.getCurrentSession()
                .getNamedQuery("User.findAll")
                .getResultList();
    }

    @Override
    public User findById(long id) {
        return sessionFactory.getCurrentSession()
                .get(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        return (User) sessionFactory.getCurrentSession()
                .getNamedQuery("User.findByName")
                .setParameter(USERNAME, username)
                .getSingleResult();
    }
}
