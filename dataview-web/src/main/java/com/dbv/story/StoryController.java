package com.dbv.story;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by firnice on 15/2/11.
 */
@Controller
public class StoryController {

    @RequestMapping(value = "/story/{page}")
    public String story(@PathVariable("page") String page) {
        return "story/" + page;
    }

}
