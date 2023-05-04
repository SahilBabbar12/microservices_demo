package com.knoldus.projectservice.service;

import com.knoldus.projectservice.model.Project;
import com.knoldus.projectservice.model.Studio;
import java.util.Optional;

public interface ProjectService {

     Optional<Project> addProjectById(Project project, Long id);


     String deleteProjectById(Long empId);


     Project updateById(Project project, Long id);

     Project getProjectRecordById(Long id);

     Studio addStudio(Studio studio);
}
