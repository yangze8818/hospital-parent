package com.kalix.hospital.usermap.biz;

import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.hospital.usermap.api.biz.IUserMapBeanService;
import com.kalix.hospital.usermap.api.dao.IUserMapBeanDao;
import com.kalix.hospital.usermap.entities.UserMapBean;

/**
 * Created by Administrator on 2018/8/11.
 */
public class UserMapBeanServiceImpl extends GenericBizServiceImpl<IUserMapBeanDao, UserMapBean> implements IUserMapBeanService {
}
