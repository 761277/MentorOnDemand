package com.mod.mod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod.mod.models.Training;

public interface TrainingRepository extends JpaRepository<Training, String> {

}
