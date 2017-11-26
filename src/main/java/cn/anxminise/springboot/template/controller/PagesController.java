package cn.anxminise.springboot.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面管理控制器
 * Created by anxminis on 2017/11/25.
 */
@Controller
public class PagesController {

    /**
     * 获取首页
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
