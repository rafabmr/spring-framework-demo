package ml.rafaelbautista.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Views {
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
