package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.Roll;

@Repository
public interface RollRepository extends CrudRepository <Roll,Integer> {

}
