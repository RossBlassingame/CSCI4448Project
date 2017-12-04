package org.csci4448.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleSpringController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHelloPage(Model model) {
        model.addAttribute("person", new Person());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String sayHello(Person person, Model model) {
        model.addAttribute("person", person);
        return "greeting";
    }

}