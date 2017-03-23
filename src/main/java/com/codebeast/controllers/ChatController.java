package com.codebeast.controllers;

import com.codebeast.Message;
import com.codebeast.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String greeting(Model model, HttpSession httpSession) {
        final User user = (User) httpSession.getAttribute("user");
        if (user == null || user.getName() == null) {
            return "redirect:/";
        }
        model.addAttribute("user", user);
        return "chat";
    }

    @PostMapping("/message")
    public void postMessage(String messageText, HttpSession httpSession) {
        final User user = (User) httpSession.getAttribute("user");
        if (user == null || user.getName() == null) {
            return;
        }
        final Message message = new Message();
        message.setName(user.getName());
        message.setMessage(messageText);
        MessageController.pushMessage(message);

    }

}