package com.zhongyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ZhongYu on 4/18/2017.
 */
@Controller
public class IndexController {

    @GetMapping({"/", "index.html"})
    public String index() {
        return "index";
    }

}
