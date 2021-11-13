package com.SEII.apis;

import java.util.List;
import com.SEII.models.Curso;
import com.SEII.services.CursoService;
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
@RequestMapping("/api/curso")
public class CursoApiController {
	@Autowired
    CursoService cursoService;
    
    @GetMapping("")
    public List<Curso> getAllCurso() {
        return cursoService.findAllCurso();
    }

    @GetMapping("{id}")
    public Curso getCurso(@PathVariable long id) {
        return cursoService.findById(id);
    }

    @PostMapping("")
    public String addCurso(@RequestBody Curso curso) {

        if(curso != null) {
        	System.out.print(curso.toString());
        	cursoService.insert(curso);
            return "Curso agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deleteCurso(@PathVariable("id") long id) {

        if(id > 0) {
            if(cursoService.delete(id)) {
                return "Deleted the Curso.";
            } else {
                return "Cannot delete the Curso.";
            }
        }
        return "The id is invalid for the Curso.";
    }

    @PutMapping("")
    public String updateCurso(@RequestBody Curso curso) {
        if(curso != null) {
        	cursoService.update(curso);
            return "Updated curso.";
        } else {
            return "Request does not contain a body";
        }
    }
}
