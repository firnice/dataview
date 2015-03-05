package com.dbv.database.manager.controller;

import com.dbv.database.manager.dto.DataSourceFactoryDto;
import com.dbv.database.manager.service.DataSourceFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by firnice on 15/3/4.
 */
@Controller
public class DatabaseManagerController {

    @Autowired
    private DataSourceFactoryService dataSourceFactoryService;

    @RequestMapping(value = "/database/{page}")
    public String database(@PathVariable("page") String page) {
        return "database/" + page;
    }

    @ResponseBody
    @RequestMapping(value = "/database/manager/save")
    public String save(DataSourceFactoryDto dataSourceFactoryDto){
        dataSourceFactoryService.save(dataSourceFactoryDto);
        return "sucess";
    }
}
