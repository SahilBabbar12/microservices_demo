package com.knoldus.projectservice.dao;

import com.knoldus.projectservice.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
        ProjectRepository interface provides the implementation of CRUD operations on the 'project' table in the database using Spring Data JPA.

        It extends the JpaRepository interface which provides JPA related methods like save, findById, delete, etc.
        */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    /**
     This method is used to retrieve the project record based on the foreign key 'fk_studio_id'.
     @param studioId foreign key of Studio entity
     @return Project object with the given studioId
     */
    @Query(
            value = "select * from project p where p.fk_studio_id=?",
            nativeQuery = true
    )
    Project findByProjectId(Long studioId);
}