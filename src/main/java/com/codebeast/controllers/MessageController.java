package com.codebeast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MessageController {

    @RequestMapping("/messages")
    public String greeting() {
        return "messages";
    }


}