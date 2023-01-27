package ml.rafaelbautista.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Api {
    
    @GetMapping("/hola")
    public String hola(){
        return "Hola mundo";
    }
}
