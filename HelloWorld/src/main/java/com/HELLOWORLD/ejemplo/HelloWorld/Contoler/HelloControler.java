package com.HELLOWORLD.ejemplo.HelloWorld.Contoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/")    
    public String holaMundo(){
        return "Hola Mundo";
    }

}
