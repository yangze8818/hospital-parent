package com.kalix.hospital.his.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/8/11.
 */
@Entity
@Table(name = "hospital_his_apis")
public class HisApiBean extends PersistentEntity {
    private String apiName;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}
