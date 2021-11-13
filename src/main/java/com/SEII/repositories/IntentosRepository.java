package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.Intentos;

@Repository
public interface IntentosRepository extends CrudRepository <Intentos,Integer> {

}
