package com.hunau.mydatauser2.controller;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 曹佳怡
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */

import com.hunau.mydatauser2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    // @Resource
    // private UserDao userDao;
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    public String Query(Model model){

        model.addAttribute("users", userService.findBy("小吴"));//1.往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到，

        //类似于request.setAttribute("sts",sts)效果一样。2.@ModelAttribute("model")   注
        return "query";
    }

    @RequestMapping("showUser/{id}")
    public String showUser(@PathVariable int id,Model model){
        model.addAttribute("name",userService.selectUser(id).toString());
        return "showuser";
    }
}
