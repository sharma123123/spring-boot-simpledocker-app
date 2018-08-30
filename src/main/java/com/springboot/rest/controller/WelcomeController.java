package com.springboot.rest.controller;

import com.springboot.beans.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WelcomeController {
    private static final String welcomemsg = "status";
    @GetMapping("/health-check")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Welcome (String.format(welcomemsg, name));
    }
}