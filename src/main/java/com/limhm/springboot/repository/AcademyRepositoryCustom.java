package com.limhm.springboot.repository;

import com.limhm.springboot.domain.Academy;

import java.util.List;

public interface AcademyRepositoryCustom {
    List<Academy> findByName(String name);
}
