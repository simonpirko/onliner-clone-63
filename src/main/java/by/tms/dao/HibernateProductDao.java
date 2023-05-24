package by.tms.dao;

import by.tms.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HibernateProductDao implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    private final static String DELETE_BY_ID = "delete from Product p where p.id = :id";
    private final static String FIND_ALL = "select p from Product p";
    private final static String FIND_BY_NAME = "select p from Product p where p.name = :name";

    @Override
    public void save(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void remove(long id) {
        sessionFactory.getCurrentSession()
                .createQuery(DELETE_BY_ID, Product.class)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Product> findAll() {
        return sessionFactory.getCurrentSession().createQuery(FIND_ALL, Product.class).getResultList();
    }

    @Override
    public Product findById(long id) {
        return sessionFactory.getCurrentSession().get(Product.class, id);
    }

    @Override
    public Product findByProductName(String name) {
        return sessionFactory.getCurrentSession()
                .createQuery(FIND_BY_NAME, Product.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
