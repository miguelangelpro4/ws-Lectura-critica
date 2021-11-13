package com.SEII.apis;

import java.util.List;
import com.SEII.models.Profesores;
import com.SEII.services.ProfesoresService;
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
@RequestMapping("/api/profesores")
public class ProfesoresApiController {
	@Autowired
    ProfesoresService profesoresService;
    
    @GetMapping("")
    public List<Profesores> getAllProfesores() {
        return profesoresService.findAllProfesores();
    }

    @GetMapping("{id}")
    public Profesores getProfesores(@PathVariable int id) {
        return profesoresService.findById(id);
    }

    @PostMapping("")
    public String addProfesores(@RequestBody Profesores profesores) {

        if(profesores != null) {
        	System.out.print(profesores.toString());
        	profesoresService.insert(profesores);
            return "Profesores agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deleteProfesores(@PathVariable("id") int id) {

        if(id > 0) {
            if(profesoresService.delete(id)) {
                return "Deleted the Profesores.";
            } else {
                return "Cannot delete the Profesores.";
            }
        }
        return "The id is invalid for the Profesores.";
    }

    @PutMapping("")
    public String updateProfesores(@RequestBody Profesores profesores) {
        if(profesores != null) {
        	profesoresService.update(profesores);
            return "Updated profesores.";
        } else {
            return "Request does not contain a body";
        }
    }
}

