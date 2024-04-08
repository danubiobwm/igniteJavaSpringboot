package br.com.projectapi.primeiroprojetospringboot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class PrimeiroController {

    @GetMapping("/primeiro/{id}")
    public String primeiroMetodo(@PathVariable String id){
        return "paramentro é: " +id;
    }

    @GetMapping("/params")
    public String metodoComQueryParams(@RequestParam String id){
    return "paramentro é: "+id;
    }

}
