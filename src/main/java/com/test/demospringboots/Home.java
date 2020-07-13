package com.test.demospringboots;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sonia
 */
@RestController
public class Home {

      @RequestMapping("/")
    public String home() {
        return "Hello Spring Boot with Docker";
    }

    @RequestMapping("/test")
    public String helloWorld() {
        return consultarById("10006546", "Hola mundo");
    }

    @RequestMapping("/consulta/{id}")
    public String consultaRegistro(@PathVariable String id) {
        return consultarById(id, "No existe registro con ese ID");
    }

    private String consultarById(String id, String nullMessage) {

       
        String devolver = nullMessage;

        return devolver;
    }

}
