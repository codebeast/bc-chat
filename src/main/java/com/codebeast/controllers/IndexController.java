package com.codebeast.controllers;

import com.codebeast.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/showChat")
    public String showChat(@ModelAttribute User user, final HttpSession httpSession) {
        httpSession.setAttribute("username", user);
        return "redirect:/chat";
    }

}