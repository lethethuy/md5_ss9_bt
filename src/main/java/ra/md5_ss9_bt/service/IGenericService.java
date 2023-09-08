package ra.md5_ss9_bt.service;

import java.util.Optional;

public interface IGenericService <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void remove(Long id);
}
