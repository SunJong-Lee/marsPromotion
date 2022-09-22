package com.mars.marspromotion.application;

import com.mars.marspromotion.entity.Project;
import com.mars.marspromotion.repository.ProjectJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectJpaRepository projectJpaRepository;


    public ProjectService(ProjectJpaRepository projectJpaRepository) {
        this.projectJpaRepository = projectJpaRepository;
    }

    public Project findProjectById(Long id) {
        return this.projectJpaRepository.findById(id).orElseThrow(() -> new NullPointerException());
    }

    public List<Project> findProjectAll() {
        return this.projectJpaRepository.findAll();
    }


}
