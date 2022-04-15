package com.example.service_2st;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RequestBody와 ResponseBody가 구현되어 있음
@RequestMapping("/")
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcom to the Second Service.";
    }
}

