package com.mars.marspromotion.application;

import com.mars.marspromotion.common.CommonResponse;
import com.mars.marspromotion.common.ResponseService;
import com.mars.marspromotion.entity.Project;
import com.mars.marspromotion.exception.InvalidateProjectException;
import com.mars.marspromotion.repository.ProjectJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectJpaRepository projectJpaRepository;

    public ProjectService(ProjectJpaRepository projectJpaRepository) {
        this.projectJpaRepository = projectJpaRepository;
    }

    public Project findProjectById(Long id) {
        return this.projectJpaRepository.findById(id).orElseThrow(InvalidateProjectException::new);
    }

    public List<Project> findProjectAll() {
        return this.projectJpaRepository.findAll();
    }

}
