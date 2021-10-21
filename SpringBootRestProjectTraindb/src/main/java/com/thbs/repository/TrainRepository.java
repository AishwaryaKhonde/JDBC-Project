package com.thbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.model.Trains;

@Repository
public interface TrainRepository extends JpaRepository<Trains,Integer> {

}
