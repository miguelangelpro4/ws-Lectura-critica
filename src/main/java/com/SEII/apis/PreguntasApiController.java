package com.SEII.apis;

import java.util.List;
import com.SEII.models.Preguntas;
import com.SEII.services.PreguntasService;
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
@RequestMapping("/api/preguntas")
public class PreguntasApiController {
	@Autowired
    PreguntasService preguntasService;
    
    @GetMapping("")
    public List<Preguntas> getAllPreguntas() {
        return preguntasService.findAllPreguntas();
    }

    @GetMapping("{id}")
    public Preguntas getPreguntas(@PathVariable int id) {
        return preguntasService.findById(id);
    }

    @PostMapping("")
    public String addPreguntas(@RequestBody Preguntas preguntas) {

        if(preguntas != null) {
        	System.out.print(preguntas.toString());
        	preguntasService.insert(preguntas);
            return "Preguntas agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deletePreguntas(@PathVariable("id") int id) {

        if(id > 0) {
            if(preguntasService.delete(id)) {
                return "Deleted the Preguntas.";
            } else {
                return "Cannot delete the Preguntas.";
            }
        }
        return "The id is invalid for the Preguntas.";
    }

    @PutMapping("")
    public String updatePreguntas(@RequestBody Preguntas preguntas) {
        if(preguntas != null) {
        	preguntasService.update(preguntas);
            return "Updated preguntas.";
        } else {
            return "Request does not contain a body";
        }
    }
}



