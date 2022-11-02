package com.mars.marspromotion.controller;

import com.mars.marspromotion.application.ApplyService;
import com.mars.marspromotion.common.CommonResponse;
import com.mars.marspromotion.entity.Apply;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/apply")
public class ApplyController {

    private final ApplyService applyService;

    //성공
//    @PostMapping("")
//    public Apply applyPost(@RequestBody Apply applyData){
//        return applyService.save(applyData);
//    }

    @PostMapping("")
    public CommonResponse<Apply> applyPost(@RequestBody Apply applyData){
        return CommonResponse.createSuccess(applyService.save(applyData));
    }
}
