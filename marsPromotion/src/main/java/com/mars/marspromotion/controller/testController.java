package com.mars.marspromotion.controller;

import com.mars.marspromotion.service.impl.testServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class testController {

    private final testServiceImpl testService;

    @GetMapping("/test")
    public Map<String, Object> testController() {
        return testService.getTestData();
    }

}
