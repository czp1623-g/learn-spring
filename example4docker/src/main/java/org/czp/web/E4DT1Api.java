package org.czp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class E4DT1Api {

    @GetMapping("/a")
    public Object getA() {
        return "a";
    }
}
