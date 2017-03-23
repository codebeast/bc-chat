package com.codebeast.controllers;

import com.codebeast.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MessageController {

    private static List<Message> messagesList = new ArrayList<>();

    @RequestMapping("/messages")
    public String greeting(Model model) {
        System.out.println(messagesList.size());
        return "messages";
    }

    public static synchronized void pushMessage(final Message message) {
        messagesList.add(message);
    }


}