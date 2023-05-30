package by.tms.service;

import by.tms.dao.ProductDao;
import by.tms.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public void save(Product product) {
        productDao.save(product);
    }

    public void remove(long id) {
        productDao.remove(id);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findById(long id) {
        return productDao.findById(id);
    }

    public Product findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}
