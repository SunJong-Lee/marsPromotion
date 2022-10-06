package com.mars.marspromotion.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Exception {
    INVALIDATE_PROJECT(1000, "해당하는 프로젝트가 존재하지 않습니다.");

    private final int code;
    private final String message;
}
