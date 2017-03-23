package com.codebeast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String greeting() {
        //get the name from the session


        return "chat";
    }

    @PostMapping("message")
    public void postMessage(String message) {

        //get user from session

    }

}