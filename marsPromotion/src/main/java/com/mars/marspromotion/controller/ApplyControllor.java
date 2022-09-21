package com.mars.marspromotion.controller;

import com.mars.marspromotion.entity.Apply;
import com.mars.marspromotion.application.ApplyService;
import com.mars.marspromotion.application.CreateApplyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/apply")
public class ApplyControllor {

    private final ApplyService applyService;

    @PostMapping("")
    public Apply insertApply(@RequestBody CreateApplyRequest createApplyRequest){
        return applyService.insertApply(createApplyRequest.toEntity());
    }

    @GetMapping("{id}")
    public ApplyResponse findApplyById(@PathVariable(name = "id") Long id){
        return new ApplyResponse(applyService.findApplyById(id));
    }


}
