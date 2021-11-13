package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.Profesores;

@Repository
public interface ProfesoresRepository extends CrudRepository <Profesores,Integer>{

}
