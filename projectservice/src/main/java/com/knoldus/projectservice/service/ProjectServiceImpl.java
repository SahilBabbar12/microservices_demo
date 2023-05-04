package com.knoldus.projectservice.service;

import com.knoldus.projectservice.customexception.EmptyInputException;
import com.knoldus.projectservice.customexception.StudioNotFound;
import com.knoldus.projectservice.dao.ProjectRepository;
import com.knoldus.projectservice.dao.StudioRepository;
import com.knoldus.projectservice.model.Project;
import com.knoldus.projectservice.model.Studio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    StudioRepository studioRepository;

    /**
     * Add a project to the database by id of the studio.
     * @param project the project object to be added
     * @param id the id of the studio
     * @return an optional Project object if added successfully, null otherwise
     */
    @Override
    public Optional<Project> addProjectById(Project project, Long id) {
        Optional<Studio> studioRecord = studioRepository.findById(id);
        if(project.getProjectName().isEmpty() && project.getProject_email().isEmpty()){
            throw new EmptyInputException();
        }
        else {
            if (studioRecord.isPresent()) {
                Optional<Project> projectRecord = Optional.ofNullable(projectRepository.findByProjectId(id));
                if (!projectRecord.isPresent()) {
                    project.setStudio_id(id);
                    return Optional.of(projectRepository.save(project));
                }

            }
        }
    return null;
    }

    /**
     * Delete a project from the database by id.
     * @param studio_id the id of the project to be deleted
     * @return a string indicating the status of the operation
     */
    @Override
    public String deleteProjectById(Long studio_id) {
        if(studioRepository.findById(studio_id).isPresent()){
            Project deleteProject = projectRepository.findByProjectId(studio_id);
            projectRepository.delete(deleteProject);
        }
        System.out.println("deleted successfully");
        return null;
    }

    /**
     * Update a project in the database by id.
     * @param project1 the updated project object
     * @param id the id of the project to be updated
     * @return the updated Project object
     */
    @Override
    public Project updateById(Project project1, Long id) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        Project updateProject = null;
        if (projectOptional.isPresent()) {
            Project project = projectOptional.get();
            project.setProjectName(project1.getProjectName());
            project.setProject_email(project1.getProject_email());
            updateProject = projectRepository.save(project);
        }
        System.out.println("Record updated!" + updateProject);
        return updateProject;
    }

    /**
     * Get a project from the database by id.
     * @param id the id of the project to be retrieved
     * @return the retrieved Project object
     */
    @Override
    public Project getProjectRecordById(Long id) {
        if(studioRepository.findById(id).isPresent()){
            return projectRepository.findByProjectId(id);
        }
        else{
            throw new StudioNotFound();
        }

    }

    /**
     * Add a studio to the database.
     * @param studio the Studio object to be added
     * @return the added Studio object
     */
    @Override
    public Studio addStudio(Studio studio) {
        if(studio.getStudio_id()==null && studio.getName().isEmpty()){
            throw new EmptyInputException();

        }
        return studioRepository.save(studio);
    }
}
