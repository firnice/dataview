package com.dbv.database.manager.service;

import com.dbv.database.manager.dao.DataSourceFactoryDao;
import com.dbv.database.manager.dto.DataSourceFactoryDto;
import com.dbv.entity.DataSourceFactoryEntity;
import com.dbv.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by firnice on 15/3/5.
 */
@Service
@Transactional
public class DataSourceFactoryService {

    @Autowired
    private DataSourceFactoryDao dataSourceFactoryDao;

    @Autowired
    private BeanMapper beanMapper;

    public void save(DataSourceFactoryDto dataSourceFactoryDto){
//        DataSourceFactoryEntity dataSourceFactoryEntity =  beanMapper.map(dataSourceFactoryDto,DataSourceFactoryEntity.class);
//        dataSourceFactoryDao.save(dataSourceFactoryEntity);

        DataSourceFactoryEntity dataSourceFactoryEntity =   dataSourceFactoryDao.findOne("40288b844bea921a014bea95b1bf0001");
        dataSourceFactoryEntity.setDriver("Bvvv");
        dataSourceFactoryDao.save(dataSourceFactoryEntity);
    }
}
