package com.example.employeeservice.controller;


import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class GetRequestController {
    @GetMapping("/ok")
    public ResponseEntity getRequest(HttpRequest request){
        return new ResponseEntity(request,HttpStatus.OK);
    }
}
