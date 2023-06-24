package czp.ut.controller;

import czp.ut.service.UTService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ut")
public class UTController {
    @Resource(name = "ut-service")
    UTService service;

    @GetMapping("/1")
    public Object get1() {
        System.out.println("running in ut controller..");
        return "ok " + service.m1();
    }

}
