package com.dbv.database.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by firnice on 15/3/4.
 */
@Controller
public class DatabaseManagerController {

    @RequestMapping(value = "/database/{page}")
    public String database(@PathVariable("page") String page) {
        return "database/" + page;
    }
}
