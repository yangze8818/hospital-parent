package com.kalix.hospital.usermap.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.hospital.usermap.api.dao.IUserMapBeanDao;
import com.kalix.hospital.usermap.entities.UserMapBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2018/8/11.
 */
public class UserMapBeanDaoImpl extends GenericDao<UserMapBean, Long> implements IUserMapBeanDao {
    @Override
    @PersistenceContext(unitName = "usermap-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
