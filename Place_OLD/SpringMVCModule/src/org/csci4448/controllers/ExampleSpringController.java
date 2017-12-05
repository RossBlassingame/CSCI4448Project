package org.csci4448.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleSpringController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showHelloPage(Model model) {
        model.addAttribute("account", new UserAccount());
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String sayHello(UserAccount a, Model model) {
        model.addAttribute("account", a);
        return "greeting";
    }
}