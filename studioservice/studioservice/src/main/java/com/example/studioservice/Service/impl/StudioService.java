package com.example.studioservice.Service.impl;

import com.example.studioservice.Model.Project;
import com.example.studioservice.Model.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudioService {

    private RestTemplate restTemplate;

    @Autowired
    public StudioService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public String saveStudio(Project project){
        HttpEntity<Project> entity = new HttpEntity<>(project);
        return restTemplate.exchange("http://localhost:8080/addProject", HttpMethod.POST, entity, String.class).getBody();
    }

    public List<Studio> getStudioById(Long id){
        return restTemplate.exchange("", HttpMethod.GET, null, List.class).getBody();

    }
}
