package com.SEII.apis;
import java.util.List;

import com.SEII.models.Roll;
import com.SEII.services.RollService;
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
@RequestMapping("/api/roll")
public class RollApiController {
	@Autowired
	RollService rollService;
    
    @GetMapping("")
    public List<Roll> getAllRoll() {
        return rollService.findAllRoll();
    }

    @GetMapping("{id}")
    public Roll getRoll(@PathVariable int id) {
        return rollService.findById(id);
    }

    @PostMapping("")
    public String addRoll(@RequestBody Roll roll) {

        if(roll != null) {
        	System.out.print(roll.toString());
        	rollService.insert(roll);
            return "Roll agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deleteRoll(@PathVariable("id") int id) {

        if(id > 0) {
            if(rollService.delete(id)) {
                return "Deleted the Roll.";
            } else {
                return "Cannot delete the Roll.";
            }
        }
        return "The id is invalid for the Roll.";
    }

    @PutMapping("")
    public String updateRoll(@RequestBody Roll roll) {
        if(roll != null) {
        	rollService.update(roll);
            return "Updated Roll.";
        } else {
            return "Request does not contain a body";
        }
    }
}

