package com.mars.marspromotion.application;

import com.mars.marspromotion.entity.Apply;
import lombok.Builder;
import lombok.Getter;


@Getter
public class CreateApplyRequest {
    private long id;
    private String name;
    private String phoneNumber;
    private int type;
    private String objective;

    public Apply toEntity() {
        Apply apply = Apply.builder()
                .id(id)
                .name(name)
                .objective(objective)
                .phoneNumber(phoneNumber)
                .type(type)
                .build();
        return apply;
    }

    @Builder
    public CreateApplyRequest(Long id, String name, String phoneNumber, int type, String objective) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.objective = objective;
    }
}
