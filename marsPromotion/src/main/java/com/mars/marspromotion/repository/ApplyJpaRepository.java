package com.mars.marspromotion.repository;

import com.mars.marspromotion.entity.Apply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyJpaRepository extends JpaRepository<Apply, Long> {
}
