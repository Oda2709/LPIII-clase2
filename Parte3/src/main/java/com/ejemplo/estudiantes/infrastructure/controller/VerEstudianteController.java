package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.VerEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class VerEstudianteController {

    private final VerEstudianteService verEstudianteService;

    @GetMapping //consulta
    public List<Estudiante> obtenerEstudiantes() {
        /*return List.of( // fijo
          Estudiante.builder().id(1L)
                  .nombre("Oda")
                  .apellido("Mosquera")
                  .edad(27)
                  .build(),
                Estudiante.builder()
                        .id(30L).nombre("Maria")
                        .apellido("Lopez")
                        .edad(50)
                        .build()
        );*/


      log.info("Se están pidiendo todos los estudiantes");
        return verEstudianteService.obtenerEstudiantes();
    }
}
