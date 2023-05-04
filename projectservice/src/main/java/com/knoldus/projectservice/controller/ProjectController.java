package com.knoldus.projectservice.controller;

import com.knoldus.projectservice.model.Project;
import com.knoldus.projectservice.model.Studio;
import com.knoldus.projectservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
 The ProjectController class is a Spring MVC controller
 that handles HTTP requests related to project and studio data.
 */
@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    /**
     * Adds a project to the database associated with the specified studio id.
     *
     * @param project The project to be added to the database.
     * @param id      The id of the studio to associate the project with.
     * @return An optional containing the added project if successful, or an empty optional if the operation failed.
     */
    @PostMapping("addProject/{id}")
    public Optional<Project> addProjectInData(@RequestBody Project project, @PathVariable Long id) {
        return projectService.addProjectById(project, id);
    }

    /**
     * Updates a project record in the database with the specified id.
     *
     * @param project The updated project information to be stored in the database.
     * @param id      The id of the project record to be updated.
     * @return The updated project record.
     */
    @PutMapping("updateProject/{id}")
    public Project updateProjectById(@RequestBody Project project, @PathVariable Long id) {
        return projectService.updateById(project, id);
    }

    /**
     * Deletes a project record from the database with the specified id.
     *
     * @param id The id of the project record to be deleted.
     */
    @DeleteMapping("deleteProject/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProjectById(id);
    }

    /**
     * Retrieves a project record from the database with the specified id.
     *
     * @param id The id of the project record to be retrieved.
     * @return The project record with the specified id.
     */
    @GetMapping("getById/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectRecordById(id);
    }

    /**
     * Adds a new studio record to the database.
     *
     * @param studio The studio information to be added to the database.
     * @return The added studio record.
     */
    @PostMapping("addstudio")
    public Studio addStudioRecord(@RequestBody Studio studio) {
        return projectService.addStudio(studio);
    }
}
