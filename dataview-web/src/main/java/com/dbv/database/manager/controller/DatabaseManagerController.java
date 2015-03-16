package com.dbv.database.manager.controller;

import com.dbv.database.manager.dto.DataSourceFactoryDto;
import com.dbv.database.manager.service.DataSourceFactoryService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by firnice on 15/3/4.
 */
@Controller
public class DatabaseManagerController {

    @Autowired
    private DataSourceFactoryService dataSourceFactoryService;

//    @RequestMapping(value = "/database/{page}")
//    public String database(@PathVariable("page") String page) {
//        return "database/" + page;
//    }

    @ResponseBody
    @RequestMapping(value = "/database/manager/save")
    public String save(DataSourceFactoryDto dataSourceFactoryDto) {
        dataSourceFactoryService.save(dataSourceFactoryDto);
        return "sucess";
    }

    // 特别设定多个ReuireRoles之间为Or关系，而不是默认的And.
//    @RequiresRoles(value = { "Admin", "User" }, logical = Logical.OR)
    @RequestMapping(value = "/database/manager")
    public String list(Model model) {

        List list = Lists.newArrayList();
        list = dataSourceFactoryService.find();
        model.addAttribute("databases", list);
        return "database/manager";
    }
}
