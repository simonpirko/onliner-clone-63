package by.tms.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    void save(T value);
    void remove(long id);
    List<T> findAll();
    T findById(long id);
}
