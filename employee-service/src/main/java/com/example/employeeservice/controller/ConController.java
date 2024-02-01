package com.example.employeeservice.controller;

import com.example.employeeservice.dto.DtoCon;
import com.example.employeeservice.service.APIDepartment;
import com.example.employeeservice.service.imp.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RequestMapping("/api/employees")
@AllArgsConstructor
public class ConController {



    private DepartmentService departmentService;

    @GetMapping("/dep")
    public DtoCon con() {
        return departmentService.getDepartmentApi();
    }
}
