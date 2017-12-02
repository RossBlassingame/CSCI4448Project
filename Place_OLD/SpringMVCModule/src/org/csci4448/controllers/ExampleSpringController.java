package org.csci4448.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleSpringController {
    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("someAttribute","Hello, World");
        return "index";
    }

}