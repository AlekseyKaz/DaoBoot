package com.example.DaoBoot.controllers;


import com.example.DaoBoot.models.User;
import com.example.DaoBoot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminControllers {
private final UserService userService;

    public AdminControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String showUserList(Model model) {
        model.addAttribute("users",userService.findAll());
        return "admin";
    }
    @GetMapping("/signup")
    public String showUserSignFrom(User user) {
        return "add-user";

    }
    @PostMapping("/adduser")
    public String addUser(User user, Model model) {
        userService.save(user);
        return "redirect:/admin";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user",user);
        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id,User user, Model model) {
        userService.save(user);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        User user = userService.findById(id);
        userService.delete(user);
        return "redirect:/admin";
    }
}

