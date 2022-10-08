package com.mars.marspromotion.controller;

import com.mars.marspromotion.application.ProjectService;
import com.mars.marspromotion.common.ListResponse;
import com.mars.marspromotion.common.ResponseService;
import com.mars.marspromotion.common.SingleResponse;
import com.mars.marspromotion.entity.Project;
import com.mars.marspromotion.vo.ProjectResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/project")
public class ProjectController {

    private final ProjectService projectService;
    private final ResponseService responseService;

    @GetMapping("{id}")
    public SingleResponse<ProjectResponse> findProjectById(@PathVariable(name = "id") Long id){
        return responseService.getSingleResponse(new ProjectResponse(projectService.findProjectById(id)));
    }

    @GetMapping("")
    public ListResponse<Project> findProjectAll(){

        return responseService.getListResponse(projectService.findProjectAll());
    }
}
