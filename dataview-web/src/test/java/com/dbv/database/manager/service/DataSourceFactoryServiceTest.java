package com.dbv.database.manager.service;

import com.dbv.database.manager.dao.DataSourceFactoryDao;
import com.dbv.entity.DataSourceFactoryEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by firnice on 15/3/5.
 */
@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DataSourceFactoryServiceTest {

    @Autowired
    private DataSourceFactoryDao dataSourceFactoryDao;

    @Test
    @Transactional
    public void testSave() throws Exception {
        DataSourceFactoryEntity dataSourceFactoryEntity = new DataSourceFactoryEntity();
        dataSourceFactoryEntity.setDriver("1");
        dataSourceFactoryEntity.setUrlstr("2");
        dataSourceFactoryEntity.setUsername("3");
        dataSourceFactoryEntity.setUserpassword("4");
        dataSourceFactoryDao.save(dataSourceFactoryEntity);

    }
}
