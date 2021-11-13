package com.SEII.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SEII.models.ParametrosConfig;
import com.SEII.repositories.ParametrosConfigRepository;

@Service
public class ParametrosConfigService {
	@Autowired
	ParametrosConfigRepository repository;

    public List<ParametrosConfig> findAllParametrosConfig() {
        return (List<ParametrosConfig>)repository.findAll();
    }

    public ParametrosConfig insert(ParametrosConfig p) {
    	
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

    public ParametrosConfig findById(int id) {
        Optional<ParametrosConfig> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    public boolean update(ParametrosConfig p) {
        try {
            repository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
