package com.lanqiao.tutorials.controller;

import com.lanqiao.tutorials.model.Users;
import com.lanqiao.tutorials.service.IUsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author 赵林
 * @date 2021/7/16 10:44
 **/
@Controller //组合了@controller 和 @ ResponseBody注解，所有都异步处理方法,响应的都是json
@SessionAttributes({"logUser"})
@Slf4j
public class UserController {
    @Autowired
    IUsersService usersService;

    @GetMapping("/") //@PostMapping @DeleteMapping@PutMapping
    public String index(){
        return "user/login";
    }

    @RequestMapping("/user/login")
    public String login(Users user, Model model){
        Users logUser = this.usersService.selectForLogin(user);
        //log.info(logUser.toString());
        if (logUser!=null){
            model.addAttribute("logUser", logUser);
            return "redirect:/emps"; // 重定向只可以定向到控制器，不可定向到模板页面
        }else {
            return "user/login";
        }
    }
}
