package com.color.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.color.entity.ColorEntity;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, Integer>{

}
