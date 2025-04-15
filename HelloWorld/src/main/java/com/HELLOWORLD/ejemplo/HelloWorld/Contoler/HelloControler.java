package com.HELLOWORLD.ejemplo.HelloWorld.Contoler;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HELLOWORLD.ejemplo.HelloWorld.Modelo.Student;

@RestController
@RequestMapping("Api/v1")
public class HelloControler {

    ArrayList<Student> estudiantes = new ArrayList<>();

    Student estudiante1 = new Student("1", "Joaquin Lepe", 27);
    Student estudiante2 = new Student("2", "Jose Perez", 21);
    Student estudiante3 = new Student("3", "Manuel Lopez", 19);

    estudiantes.add(estudiante1);
    estudiantes.add(estudiante2);
    estudiantes.add(estudiante3);


    @GetMapping("/inicio")
    public String holaMundo(){
        return "Hola Mundo";
    }

}
