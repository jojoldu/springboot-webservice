package com.jojoldu.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 31.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public String main() {
        return "main";
    }
}
