package com.SEII.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SEII.models.Intentos;
import com.SEII.repositories.IntentosRepository;

@Service
public class IntentosService {
	@Autowired
	IntentosRepository repository;

    public List<Intentos> findAllIntentos() {
        return (List<Intentos>)repository.findAll();
    }

    public Intentos insert(Intentos p) {
    	
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

    public Intentos findById(int id) {
        Optional<Intentos> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    public boolean update(Intentos p) {
        try {
            repository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
