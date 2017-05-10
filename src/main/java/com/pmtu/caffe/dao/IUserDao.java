package com.pmtu.caffe.dao;

import com.pmtu.caffe.entity.UserEntity;

/**
 * Created by Mr Tu on 06-05-2017.
 */
public interface IUserDao extends IGenericDAO<UserEntity> {

    public UserEntity login(String username,String passworld);
}
