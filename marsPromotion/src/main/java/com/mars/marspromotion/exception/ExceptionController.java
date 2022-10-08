package com.mars.marspromotion.exception;

import com.mars.marspromotion.common.CommonResponse;
import com.mars.marspromotion.common.ResponseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionController {

    private final ResponseService responseService;

    @ExceptionHandler(InvalidateProjectException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CommonResponse invalidateProjectException(InvalidateProjectException e) {
        log.info(e.getMessage());
        return responseService.getErrorResponse(Exception.INVALIDATE_PROJECT.getCode(), Exception.INVALIDATE_PROJECT.getMessage());
    }

}
