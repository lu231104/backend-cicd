package com.cicd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {
    /**
     * Endpoint para saludar que acepta un parámetro 'nombre'
     * en la consulta.
     * Ejemplo de uso: GET /api/saludo?nombre=Laura
     * 
     * @param nombre El nombre proporcionado por el usuario
     *               en el frontend.
     * @return String con el mensaje de saludo
     *         personalizado.
     */
    @GetMapping("/saludo")
    public String saludar(@RequestParam(value = "nombre", defaultValue = "Invitado") String nombre) {
        return String.format("¡Hola, %s! Tu mensaje fue validado.", nombre);
    }
}