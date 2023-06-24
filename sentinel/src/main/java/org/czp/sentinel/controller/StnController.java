package org.czp.sentinel.controller;

import org.czp.common.log.Log;
import org.czp.common.rest.Resp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stn")
public class StnController {

    @GetMapping("/1")
    public Resp get01(String s) {
        Log.i(s);
        return Resp.gen200();
    }

    @PostMapping("/1")
    public Resp post01(String s) {
        Log.i(s);
        return Resp.gen200();
    }

    @GetMapping("/2")
    public Resp get02(String s) {
        Log.i(s);
        return Resp.gen200();
    }
}
