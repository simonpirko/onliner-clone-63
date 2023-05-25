package by.tms.dao;

import by.tms.entity.parameter.Parameter;
import by.tms.entity.parameter.ProductParameter;

public interface ProductParameterDao extends Dao<ProductParameter>{
    ProductParameter findByParameter(Parameter parameter);
}
