package com.SEII.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SEII.models.Preguntas;
import com.SEII.repositories.PreguntasRepository;

@Service
public class PreguntasService {
	@Autowired
	PreguntasRepository repository;

    public List<Preguntas> findAllPreguntas() {
        return (List<Preguntas>)repository.findAll();
    }

    public Preguntas insert(Preguntas p) {
    	
    	try 
    	{
    		return repository.save(p);
    	}
    	catch(Exception e) 
    	{
    		System.out.println(e.getMessage());
    		return p;
    	}
        
    }

    public boolean delete(int id) {
        try {
        	repository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Preguntas findById(int id) {
    	Optional<Preguntas> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    public boolean update(Preguntas p) {
        try {
            repository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

