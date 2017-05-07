package com.pmtu.caffe.service;

import java.util.List;

/**
 * Created by Mr Tu on 07-05-2017.
 */
public interface IGenerateService<T> {
    void create(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(Long id) throws Exception;

    T get(Long id) throws Exception;

    List<T> getall() throws Exception;
}
