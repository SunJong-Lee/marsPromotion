package com.mars.marspromotion.controller;

import com.mars.marspromotion.application.ProjectService;
import com.mars.marspromotion.entity.Project;
import com.mars.marspromotion.vo.ProjectResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/project")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("{id}")
    public ProjectResponse findProjectById(@PathVariable(name = "id") Long id){
        return new ProjectResponse(projectService.findProjectById(id));
    }

    @GetMapping("")
    public List<Project> findProjectAll(){
        return projectService.findProjectAll();
    }
}
