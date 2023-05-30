package by.tms.service;

import by.tms.dao.HibernateProductDao;
import by.tms.dao.ProductDao;
import by.tms.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private final ProductDao productDao = new HibernateProductDao();

    @Transactional
    public void save(Product product) {
        productDao.save(product);
    }

    @Transactional
    public void remove(long id) {
        productDao.remove(id);
    }

    @Transactional
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Transactional
    public Product findById(long id) {
        return productDao.findById(id);
    }

    @Transactional
    public Product findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}
