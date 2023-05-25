package by.tms.service;

import by.tms.dao.HibernateProductDao;
import by.tms.dao.ProductDao;
import by.tms.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductDao productDao = new HibernateProductDao();

    public void save(Product product){
        productDao.save(product);
    }

    public void remove(long id){
        productDao.remove(id);
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(long id){
        return productDao.findById(id);
    }

    public Product findByProductName(String name){
        return productDao.findByProductName(name);
    }
}
