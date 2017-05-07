package com.pmtu.caffe.dao.Impl;

import com.pmtu.caffe.dao.GenericDAO;
import com.pmtu.caffe.dao.IUserDao;
import com.pmtu.caffe.entity.UserEntity;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Mr Tu on 06-05-2017.
 */
public class UserDaoImpl extends GenericDAO<UserEntity> implements IUserDao {

    @Override
    public boolean update(UserEntity userEntity) throws Exception {
        userEntity.setModifiedDate(new LocalDate());
        return super.update(userEntity);
    }
}
