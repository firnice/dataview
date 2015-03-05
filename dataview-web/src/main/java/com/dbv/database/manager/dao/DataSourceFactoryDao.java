package com.dbv.database.manager.dao;

import com.dbv.entity.DataSourceFactoryEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by firnice on 15/3/5.
 */
public interface DataSourceFactoryDao extends PagingAndSortingRepository<DataSourceFactoryEntity, String>, JpaSpecificationExecutor<DataSourceFactoryEntity> {

}
