package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
    @RequestMapping("/showform")
    public String displayTheForm() {
        return "silly";
    }
}
