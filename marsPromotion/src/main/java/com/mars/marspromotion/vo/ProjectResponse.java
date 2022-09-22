package com.mars.marspromotion.vo;

import com.mars.marspromotion.entity.Project;
import lombok.Getter;

import java.util.List;

@Getter
public class ProjectResponse {
    private long id;
    private String title;
    private String year;
    private String language;
    private String content;
    private String link;
    private int type;

    public ProjectResponse(Project project){
        this.id = project.getId();
        this.title = project.getTitle();
        this.year = project.getYear();
        this.language = project.getLanguage();
        this.content = project.getContent();
        this.link = project.getLink();
        this.type = project.getType();
    }
}
