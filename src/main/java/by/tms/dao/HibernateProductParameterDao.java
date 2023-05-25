package by.tms.dao;

import by.tms.entity.Product;
import by.tms.entity.User;
import by.tms.entity.parameter.Parameter;
import by.tms.entity.parameter.ProductParameter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HibernateProductParameterDao implements ProductParameterDao{
    @Autowired
    private SessionFactory sessionFactory;
    private final static String DELETE_BY_ID = "delete from ProductParameter p where p.id = :id";
    private final static String FIND_ALL = "select p from ProductParameter p";
    private final static String FIND_BY_NAME = "select p from ProductParameter p where p.parameter = :parameter";
    private static final String ID = "id";
    private static final String PARAMETER = "parameter";

    @Override
    public ProductParameter findByParameter(Parameter parameter) {
        return sessionFactory.getCurrentSession()
                .createQuery(FIND_BY_NAME, ProductParameter.class)
                .setParameter(PARAMETER, parameter)
                .getSingleResult();
    }

    @Override
    public void save(ProductParameter productParameter) {
        sessionFactory.getCurrentSession().save(productParameter);
    }

    @Override
    public void remove(long id) {
        sessionFactory.getCurrentSession()
                .createQuery(DELETE_BY_ID, ProductParameter.class)
                .setParameter(ID, id)
                .executeUpdate();
    }

    @Override
    public List<ProductParameter> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery(FIND_ALL, ProductParameter.class)
                .getResultList();
    }

    @Override
    public ProductParameter findById(long id) {
        return sessionFactory.getCurrentSession()
                .get(ProductParameter.class, id);
    }
}
