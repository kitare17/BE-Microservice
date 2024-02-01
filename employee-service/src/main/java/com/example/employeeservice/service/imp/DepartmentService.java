package com.example.employeeservice.service.imp;

import com.example.employeeservice.dto.DtoCon;
import com.example.employeeservice.service.APIDepartment;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {

    private APIDepartment apiDepartment;
    public DtoCon getDepartmentApi(){

        return apiDepartment.getDtoCon();
    }
}
