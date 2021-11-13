package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.ParametrosConfig;

@Repository
public interface ParametrosConfigRepository extends CrudRepository <ParametrosConfig,Integer> {

}
