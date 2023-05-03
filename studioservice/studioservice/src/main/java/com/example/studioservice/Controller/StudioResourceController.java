package com.example.studioservice.Controller;

import com.example.studioservice.Model.Project;
import com.example.studioservice.Model.Studio;
import com.example.studioservice.Service.impl.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudioResourceController {

    @Autowired
    StudioService employeeService;
    @PostMapping("post-studio")
    public String saveEmployee(@RequestBody Project project){
        return employeeService.saveStudio(project);
    }

    @GetMapping("get-studio/{id}")
    public List<Studio> getEmployeesRest(@PathVariable Long id){
        return employeeService.getStudioById(id);
    }
}
