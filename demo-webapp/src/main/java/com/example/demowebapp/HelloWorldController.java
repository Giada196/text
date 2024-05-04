package com.example.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam (required = true)String nome,
                       @RequestParam(required = false, defaultValue = "Lombardia") String provincia){
        return "Ciao " + nome + ", " + "com'è il tempo in " + provincia + "?";
    }
}
