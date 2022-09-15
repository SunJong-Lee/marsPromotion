package com.mars.marspromotion.service;

import com.mars.marspromotion.entity.Apply;
import com.mars.marspromotion.repository.ApplyJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplyService {
    private final ApplyJpaRepository applyJpaRepository;

    public ApplyService(ApplyJpaRepository applyJpaRepository) {
        this.applyJpaRepository = applyJpaRepository;
    }

    public Apply insertApply(Apply apply) {
        return this.applyJpaRepository.save(apply);
    }

    public Optional<Apply> findApplyById(Long id) {
        return this.applyJpaRepository.findById(id);
    }
}
