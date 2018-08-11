package com.kalix.hospital.weixin.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.hospital.weixin.api.dao.IWeixinMenuBeanDao;
import com.kalix.hospital.weixin.entities.WeixinMenuBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2018/8/11.
 */
public class WeixinMenuBeanDaoImpl extends GenericDao<WeixinMenuBean, Long> implements IWeixinMenuBeanDao {
    @Override
    @PersistenceContext(unitName = "weixin-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
