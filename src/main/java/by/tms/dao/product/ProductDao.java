package by.tms.dao.product;

import by.tms.dao.Dao;
import by.tms.entity.Product;

public interface ProductDao extends Dao<Product> {
    Product findByProductName(String name);
}
