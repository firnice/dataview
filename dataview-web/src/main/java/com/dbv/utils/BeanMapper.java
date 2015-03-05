/**
 * Copyright (c) 2005-2012 springside.org.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.dbv.utils;

import com.google.common.collect.Lists;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * 
 * @author liyiliang
 * @class
 * @date 2013-11-27
 * @discription 简单封装Dozer, 实现深度转换Bean<->Bean的Mapper.实现: 1. 持有Mapper的单例. 2. 返回值类型转换. 3. 批量转换Collection中的所有对象. 4.
 *              区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 */
@Component
public class BeanMapper {

	@Autowired
    Mapper dozerBeanMapper;

	/**
	 * 基于Dozer转换对象的类型.
	 */
	public <T> T map(Object source, Class<T> destinationClass) {
		return dozerBeanMapper.map(source, destinationClass);
	}

	/**
	 * 基于Dozer转换Collection中对象的类型.
	 */
	public <T> List<T> mapList(Collection<?> sourceList, Class<T> destinationClass) {
		List<T> destinationList = Lists.newArrayList();
		for (Object sourceObject : sourceList) {
			T destinationObject = dozerBeanMapper.map(sourceObject, destinationClass);
			destinationList.add(destinationObject);
		}
		return destinationList;
	}
	
	/**
	 * 基于Dozer转换Collection中对象的类型.
	 * @throws Exception 
	 */
	public <T> List<T> mapListAndSetOptAndTime(Collection<?> sourceList, Class<T> destinationClass,String opter) throws Exception {
		List<T> destinationList = Lists.newArrayList();
		for (Object sourceObject : sourceList) {
			T destinationObject = dozerBeanMapper.map(sourceObject, destinationClass);
			destinationList.add(destinationObject);
		}
		return destinationList;
	}

	/**
	 * 基于Dozer将对象A的值拷贝到对象B中.
	 */
	public void copy(Object source, Object destinationObject) {
		dozerBeanMapper.map(source, destinationObject);
	}
}