package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
