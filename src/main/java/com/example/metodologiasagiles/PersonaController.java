package com.example.metodologiasagiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;


    @PostMapping("")
    public Persona agregarPersona(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }


}

