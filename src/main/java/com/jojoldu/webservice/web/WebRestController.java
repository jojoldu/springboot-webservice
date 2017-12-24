package com.jojoldu.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 24.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
