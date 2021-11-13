package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.Preguntas;

@Repository
public interface PreguntasRepository extends CrudRepository <Preguntas,Integer> {

}
