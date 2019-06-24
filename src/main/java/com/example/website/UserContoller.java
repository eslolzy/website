package com.example.website;

import com.example.website.model.DataProvider;
import com.example.website.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/user")
public class UserContoller {

    @Autowired
    private DataProvider provider;

    @GetMapping (path = "/index")
    public String getLogin(Model model) {
        return "genres";
    }

    @PostMapping(path = "/registation")
    public String registration(User user, Model model) {
        DataProvider.users.add(user);
        return "genres";
    }



}
