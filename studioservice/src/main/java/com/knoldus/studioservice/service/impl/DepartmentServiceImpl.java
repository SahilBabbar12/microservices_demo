package com.knoldus.studioservice.service.impl;

import com.knoldus.studioservice.Model.Department;
import com.knoldus.studioservice.repository.DepartmentRepository;
import com.knoldus.studioservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department addNewStudio(Department department) {
        return departmentRepository.save(department);

    }
}
