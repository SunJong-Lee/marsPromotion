package com.mars.marspromotion.controller;

import com.mars.marspromotion.entity.Apply;
import lombok.Getter;

import java.util.Optional;

@Getter
public class ApplyResponse {
    private long id;
    private String name;
    private String phoneNumber;
    private int type;
    private String objective;

    public ApplyResponse(Apply apply) {
        this.id = apply.getId();
        this.name = apply.getName();
        this.phoneNumber = apply.getPhoneNumber();
        this.type = apply.getType();
        this.objective = apply.getObjective();
    }
}
