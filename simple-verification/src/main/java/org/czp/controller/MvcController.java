package org.czp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sv")
public class MvcController {

    @GetMapping("/1")
    public String get() {
        return "home";
    }
}
