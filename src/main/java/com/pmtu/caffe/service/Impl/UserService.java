package com.pmtu.caffe.service.Impl;

import com.pmtu.caffe.dao.Impl.UserDaoImpl;
import com.pmtu.caffe.entity.UserEntity;
import com.pmtu.caffe.service.IUserService;

import java.util.List;

/**
 * Created by Mr Tu on 07-05-2017.
 */
public class UserService implements IUserService<UserEntity> {

    private UserDaoImpl userDao=new UserDaoImpl();

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(UserEntity userEntity) throws Exception {
        userDao.create(userEntity);
    }

    @Override
    public boolean update(UserEntity userEntity) throws Exception {

        return userDao.update(userEntity);
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return userDao.delete(id,UserEntity.class);
    }

    @Override
    public UserEntity get(Long id) throws Exception {
        return userDao.get(id,UserEntity.class);
    }

    @Override
    public List<UserEntity> getall() throws Exception {
        return userDao.getall(UserEntity.class);
    }

    @Override
    public UserEntity login(String username, String passworld) {
        return null;
    }

    @Override
    public boolean checkExists(String username) {
        return false;
    }

    @Override
    public void changeStatus() {

    }
}
