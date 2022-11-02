package com.mars.marspromotion.application;

import com.mars.marspromotion.entity.Apply;
import com.mars.marspromotion.repository.ApplyJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplyService {
    private final ApplyJpaRepository applyJpaRepository;

    public ApplyService(ApplyJpaRepository applyJpaRepository) {
        this.applyJpaRepository = applyJpaRepository;
    }

    public Apply save(Apply apply){
        applyJpaRepository.save(apply);
        return apply;
    }

}
