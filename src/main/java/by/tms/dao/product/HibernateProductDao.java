package by.tms.dao.product;

import by.tms.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateProductDao implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void remove(long id) {
        sessionFactory.getCurrentSession()
                .getNamedQuery("Product.remove")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) sessionFactory.getCurrentSession()
                .getNamedQuery("Product.findAll")
                .getResultList();
    }

    @Override
    public Product findById(long id) {
        return sessionFactory.getCurrentSession()
                .get(Product.class, id);
    }

    @Override
    public Product findByProductName(String name) {
        return (Product) sessionFactory.getCurrentSession()
                .getNamedQuery("Product.findByName")
                .setParameter("name", name)
                .getSingleResult();
    }
}
