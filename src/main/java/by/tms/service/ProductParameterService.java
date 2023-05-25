package by.tms.service;

import by.tms.dao.HibernateProductParameterDao;
import by.tms.dao.ProductParameterDao;
import by.tms.entity.parameter.Parameter;
import by.tms.entity.parameter.ProductParameter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductParameterService {
    private final ProductParameterDao productParameterDao = new HibernateProductParameterDao();

    public void save(ProductParameter productParameter){
        productParameterDao.save(productParameter);
    }

    public void remove(long id){
        productParameterDao.remove(id);
    }

    public List<ProductParameter> findAll(){
        return productParameterDao.findAll();
    }

    public ProductParameter findById(long id){
        return productParameterDao.findById(id);
    }

    public ProductParameter findByProductName(Parameter parameter){
        return productParameterDao.findByParameter(parameter);
    }
}
