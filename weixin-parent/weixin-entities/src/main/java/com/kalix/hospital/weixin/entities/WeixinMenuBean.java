package com.kalix.hospital.weixin.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/8/11.
 */
@Entity
@Table(name = "hospital_weixin_menu")
public class WeixinMenuBean extends PersistentEntity {
    private String menuName;
    private String menuKey;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }
}
