package org.gns.intellicontact.controller;
import jakarta.servlet.http.HttpSession;
import org.gns.intellicontact.dao.UserRepository;
import org.gns.intellicontact.entities.User;
import org.gns.intellicontact.helper.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("title","IntelliContact-Home");
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("title","IntelliContact-About");
        return "about";
    }
    @RequestMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title","IntelliContact-Sign Up");
        model.addAttribute("user", new User());
        return "signup";
    }
    @RequestMapping(value = "/do_register", method= RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, Model model, BindingResult result1, HttpSession session){

        if(result1.hasErrors()){
            System.out.println("ERROR"+result1.toString());
            model.addAttribute("user",user);
            return "signup";
        }

        try {
            user.setRole("ROLE_USER");
            user.setEnabled(true);
            user.setImageUrl("default.png");
            System.out.println("USER "+user);
            User result=this.userRepository.save(user);
            model.addAttribute("user",new User());
            session.setAttribute("message", new Message("Successfully Registered","alert-success"));

            return "signup";
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("user",user);
            session.setAttribute("message", new Message("Something Went Wrong"+e.getMessage(),"alert-danger"));
            return "signup";
        }


    }
}
