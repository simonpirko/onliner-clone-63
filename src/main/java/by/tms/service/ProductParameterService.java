package by.tms.service;

import by.tms.dao.productParameter.ProductParameterDao;
import by.tms.entity.parameter.Parameter;
import by.tms.entity.parameter.ProductParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductParameterService {
    @Autowired
    private ProductParameterDao productParameterDao;

    public void save(ProductParameter productParameter){
        productParameterDao.save(productParameter);
    }

    public void remove(long id){
        productParameterDao.remove(id);
    }
    @Transactional(readOnly = true)
    public List<ProductParameter> findAll(){
        return productParameterDao.findAll();
    }
    @Transactional(readOnly = true)
    public ProductParameter findById(long id){
        return productParameterDao.findById(id);
    }
    @Transactional(readOnly = true)
    public ProductParameter findByProductName(Parameter parameter){
        return productParameterDao.findByParameter(parameter);
    }
}
