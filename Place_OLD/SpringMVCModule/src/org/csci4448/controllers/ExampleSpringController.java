package org.csci4448.controllers;

import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ExampleSpringController {
    private UserAccount currentUser;
    private UserAccount exampleFriend;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String signupLogin(Model model) {
        model.addAttribute("account", new UserAccount());
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String signUpForm(UserAccount a, Model model, RedirectAttributes r) {
        /* Get attributes of object a: userName, Password */
        r.addFlashAttribute("accountForStory", a);
        //Check if it's a new user
        if(a.getEmail() != null){
            return "redirect:/newuser";
        }

        return "redirect:/greeting";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String storyPage(@ModelAttribute("accountForStory") UserAccount a, Model model) {
        model.addAttribute("account", a);
        currentUser = a;
        model.addAttribute("story", new Story());
        return "greeting";
    }


    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String inputForm(Story s, Model model) {
        /* Get attributes of object a: userName, Password */
//        a.addStory("This is my first Story!");
//        model.addAttribute("account", a);
        model.addAttribute("account", currentUser);

        currentUser.addStoryToList(s);
        for (int i = 0; i<currentUser.getSizeOfStoryList(); i++){
            String key = "story"+Integer.toString(i);
            model.addAttribute(key,currentUser.getUserName()+": "+currentUser.getStoryAtIndex(i).getStory());
        }
        return "greeting";
    }


    @RequestMapping(value = "/newuser", method = RequestMethod.GET)
    public String newUser(@ModelAttribute("accountForStory") UserAccount a, Model model) {
        UserAccount newUser = new UserAccount();

        newUser.setEmail(a.getEmail());
        newUser.setUserName(a.getUserName());
        newUser.setPassword(a.getPassword());

        currentUser = newUser;
        model.addAttribute("account", newUser);
        return "newuser";
    }

    @RequestMapping(value = "/newuser", method = RequestMethod.POST)
    public String sendToStory(@ModelAttribute("accountForStory") UserAccount a, Model model, RedirectAttributes r) {

        r.addFlashAttribute("accountForStory", currentUser);
        return "redirect:/greeting";
    }



}