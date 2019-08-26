package com.project.MentorOnDemand.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.MentorOnDemand.mysql.model.Trainings;


public interface TrainingsRepository extends CrudRepository<Trainings, Long>{

//	public List<Trainings> getAllCustomers();
//    public List<Trainings> getCompletedTrainings();
//    public Iterable<Trainings> findAll();
//    public Trainings save(Trainings trainings);
//    public Optional<Trainings> findById(long id);
//    public void findCompletedTrainings(String string); 

}