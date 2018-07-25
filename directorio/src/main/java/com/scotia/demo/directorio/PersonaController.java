package com.scotia.demo.directorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonaController {

    @Autowired
    PersonaRepository repo;


    @GetMapping("/persona")
    public Iterable<Persona> findAll(){
        return repo.findAll();
    }

    @PostMapping("/persona")
    public Persona save(@RequestBody Persona persona){
        repo.save(persona);
        Optional<Persona> result = repo.findById(persona.getEmail());
        return result.isPresent() ? result.get() : null;
    }

}
