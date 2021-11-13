package com.SEII.apis;

import java.util.List;
import com.SEII.models.ParametrosConfig;
import com.SEII.services.ParametrosConfigService;
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
@RequestMapping("/api/parametrosconfig")
public class ParametrosConfigApiController {
	@Autowired
    ParametrosConfigService parametrosconfigService;
    
    @GetMapping("")
    public List<ParametrosConfig> getAllParametrosConfig() {
        return parametrosconfigService.findAllParametrosConfig();
    }

    @GetMapping("{id}")
    public ParametrosConfig getParametrosConfig(@PathVariable int id) {
        return parametrosconfigService.findById(id);
    }

    @PostMapping("")
    public String addParametrosConfig(@RequestBody ParametrosConfig parametrosconfig) {

        if(parametrosconfig != null) {
        	System.out.print(parametrosconfig.toString());
        	parametrosconfigService.insert(parametrosconfig);
            return "ParametrosConfig agregado";
        } else {
            return "Request does not contain a body";
        }
    }


	@DeleteMapping("{id}")
    public String deleteParametrosConfig(@PathVariable("id") int id) {

        if(id > 0) {
            if(parametrosconfigService.delete(id)) {
                return "Deleted the ParametrosConfig.";
            } else {
                return "Cannot delete the ParametrosConfig.";
            }
        }
        return "The id is invalid for the ParametrosConfig.";
    }

    @PutMapping("")
    public String updateParametrosConfig(@RequestBody ParametrosConfig parametrosconfig) {
        if(parametrosconfig != null) {
        	parametrosconfigService.update(parametrosconfig);
            return "Updated parametrosconfig.";
        } else {
            return "Request does not contain a body";
        }
    }
}

