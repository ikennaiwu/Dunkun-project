package com.test.jankins_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller
public class WelcomeController {


    @GetMapping("/welcome")
    public String getUnapprovedRequests() {

        return "welcome";
    }

}
