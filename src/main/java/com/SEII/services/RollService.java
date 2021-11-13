package com.SEII.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SEII.models.Roll;
import com.SEII.repositories.RollRepository;

@Service
public class RollService {
	@Autowired
	RollRepository repository;

    public List<Roll> findAllRoll() {
        return (List<Roll>)repository.findAll();
    }

    public Roll insert(Roll p) {
    	
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

    public Roll findById(int id) {
        Optional<Roll> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    public boolean update(Roll p) {
        try {
        	repository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

