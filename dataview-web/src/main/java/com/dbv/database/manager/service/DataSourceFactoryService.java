package com.dbv.database.manager.service;

import com.dbv.database.manager.dao.DataSourceFactoryDao;
import com.dbv.database.manager.dto.DataSourceFactoryDto;
import com.dbv.entity.DataSourceFactoryEntity;
import com.dbv.utils.BeanMapper;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

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

    public void save(DataSourceFactoryDto dataSourceFactoryDto) {
        DataSourceFactoryEntity dataSourceFactoryEntity = beanMapper.map(dataSourceFactoryDto, DataSourceFactoryEntity.class);
        dataSourceFactoryDao.save(dataSourceFactoryEntity);
    }

    public List<DataSourceFactoryDto> find() {
        List<DataSourceFactoryDto> list = Lists.newArrayList();
        Iterable iterable = dataSourceFactoryDao.findAll();
        for (Iterator<DataSourceFactoryEntity> iterator = iterable.iterator(); iterator.hasNext(); ) {
            DataSourceFactoryDto dataSourceFactoryDto = beanMapper.map((DataSourceFactoryEntity) iterator.next(), DataSourceFactoryDto.class);
            list.add((dataSourceFactoryDto));
        }
        return list;


    }

}
