package com.codebeast.controllers;

import com.codebeast.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/showChat")
    public String showChat(@ModelAttribute User user) {
        System.out.println(user.getName());
        return "redirect:/chat";
    }

}