package com.kalix.hospital.his.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.hospital.his.api.dao.IHisApiBeanDao;
import com.kalix.hospital.his.entities.HisApiBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2018/8/11.
 */
public class HisApiBeanDaoImpl extends GenericDao<HisApiBean, Long> implements IHisApiBeanDao {
    @Override
    @PersistenceContext(unitName = "his-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
