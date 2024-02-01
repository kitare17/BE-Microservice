package com.example.employeeservice.service;

import com.example.employeeservice.dto.DtoCon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIDepartment {
    @GetMapping("api/communicate")
     String testComunicate();
    @GetMapping("api/departments/dtocon")
     DtoCon getDtoCon();
}
