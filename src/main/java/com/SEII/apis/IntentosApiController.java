package com.SEII.apis;

import java.util.List;
import com.SEII.models.Intentos;
import com.SEII.services.IntentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/intentos")

public class IntentosApiController {
	@Autowired
	IntentosService intentosService;
    
    @GetMapping("")
    public List<Intentos> getAllIntentos() {
        return intentosService.findAllIntentos();
    }

    @GetMapping("{id}")
    public Intentos getIntentos(@PathVariable int id) {
        return intentosService.findById(id);
    }

    @PostMapping("")
    public String addIntentos(@RequestBody Intentos intentos) {

        if(intentos != null) {
        	System.out.print(intentos.toString());
        	intentosService.insert(intentos);
            return "Intento agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deleteIntentos(@PathVariable("id") int id) {

        if(id > 0) {
            if(intentosService.delete(id)) {
                return "Deleted the Intentos.";
            } else {
                return "Cannot delete the Intentos.";
            }
        }
        return "The id is invalid for the Intentos.";
    }

    @PutMapping("")
    public String updateIntentos(@RequestBody Intentos intentos) {
        if(intentos != null) {
        	intentosService.update(intentos);
            return "Updated intentos.";
        } else {
            return "Request does not contain a body";
        }
    }
}

