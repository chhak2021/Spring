package kr.co.farmstory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroductionController {

    @GetMapping("introduction/hello")
    public String hello(){
        return "introduction/hello";
    }

    @GetMapping("introduction/direction")
    public String direction(){
        return "introduction/direction";
    }
}
