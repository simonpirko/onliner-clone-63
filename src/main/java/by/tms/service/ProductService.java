package by.tms.service;

import by.tms.dao.product.ProductDao;
import by.tms.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public void save(Product product) {
        productDao.save(product);
    }

    public void remove(long id) {
        productDao.remove(id);
    }
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productDao.findAll();
    }
    @Transactional(readOnly = true)
    public Product findById(long id) {
        return productDao.findById(id);
    }
    @Transactional(readOnly = true)
    public Product findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}
