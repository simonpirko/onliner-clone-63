package by.tms.dao;

import by.tms.entity.Product;

public interface ProductDao extends Dao<Product> {
    Product findByProductName(String name);
}
