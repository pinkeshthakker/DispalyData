package com.citi.poc.controller;

import com.citi.poc.entity.User;
import com.citi.poc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list.do")
    public String showUserList(Model model) {
    	 List<User> users = userService.getAllUserList();
        model.addAttribute("users", users);
        return "list";
    }
}
