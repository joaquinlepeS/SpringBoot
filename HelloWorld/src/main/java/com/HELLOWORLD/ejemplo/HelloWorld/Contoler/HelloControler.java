package com.HELLOWORLD.ejemplo.HelloWorld.Contoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Api/v1")
public class HelloControler {

    @GetMapping("/inicio")
    public String holaMundo(){
        return "Hola Mundo";
    }

}
