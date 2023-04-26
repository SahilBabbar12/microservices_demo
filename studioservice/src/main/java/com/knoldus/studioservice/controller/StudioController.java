package com.knoldus.studioservice.controller;

import com.knoldus.studioservice.Model.Department;
import com.knoldus.studioservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudioController{
    @Autowired
    DepartmentService studioService;
    @GetMapping("/newstudio")
    public Department createNewStudio(@RequestBody Department department){
        return studioService.addNewStudio(department);
    }

}
