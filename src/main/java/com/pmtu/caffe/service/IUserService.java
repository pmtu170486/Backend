package com.pmtu.caffe.service;

import com.pmtu.caffe.entity.UserEntity;

/**
 * Created by Mr Tu on 07-05-2017.
 */
public interface IUserService<T> extends IGenerateService<T> {
    public UserEntity login(String username, String passworld);
    public boolean checkExists(String username);
}
