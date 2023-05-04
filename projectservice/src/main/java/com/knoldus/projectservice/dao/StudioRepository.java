package com.knoldus.projectservice.dao;

import com.knoldus.projectservice.model.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioRepository extends JpaRepository<Studio,Long> {

}
