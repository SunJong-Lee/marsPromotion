package com.mars.marspromotion.application;

import com.mars.marspromotion.entity.Project;
import com.mars.marspromotion.repository.ProjectJpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<Project> list = this.projectJpaRepository.findAll();
//        for(int i = 0; i < list.toArray().length; i++){
//
//        }
        List<Project> returnList = new ArrayList<>();
        for (Project project: list) {
            String delYn = project.getDelYn();
            if(delYn == "N"){
                returnList.add(project);
                System.out.println(project);
            }
        }
//        return this.projectJpaRepository.findAll();
        return returnList;
    }


}
