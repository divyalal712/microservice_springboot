package com.sample.project.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controllerme {
    @GetMapping("/")
    public String getwish(){
        return "Good wishes";
    }

    @PostMapping("/create")
    public ResponseEntity<String> postObject(@RequestBody String str){
        return new ResponseEntity<>(str +" is saved", HttpStatus.OK);
    }
}
