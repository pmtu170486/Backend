package com.pmtu.caffe.dao;

import java.util.List;

/**
 * Created by Mr Tu on 06-05-2017.
 */
public interface IGenericDAO<T> {
    void create(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(Long id,Class<T> t) throws Exception;

    T get(Long id, Class<T> t) throws Exception;

    List<T> getall(Class<T> t) throws Exception;
}
