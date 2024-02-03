package com.example.departmentservice.controller;

import com.example.departmentservice.dto.DtoCon;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("api/departments")
public class ComunicateController {
    @GetMapping("communicate")
    public String testComunicate(){
        return "department service";
    }
    @GetMapping("dtocon")
    public DtoCon getDtoCon(){
        DtoCon con=new DtoCon("name");
        return con;
    }
}
