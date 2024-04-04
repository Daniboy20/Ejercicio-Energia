package unah.hn.lenguajes.demo.energia.controller;

import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.demo.energia.entities.TipoResidencia;
import unah.hn.lenguajes.demo.energia.service.impl.TipoResidenciaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/tiporesidencia")
public class TipoResidenciaController {
    
    @Autowired
    private TipoResidenciaServiceImpl tipoResidenciaServiceImpl;

    @PostMapping("/crear")
    public TipoResidencia creaTipoResidencia(@RequestBody TipoResidencia tipoResidencia) {
       return this.tipoResidenciaServiceImpl.crearTipoResidencia(tipoResidencia);
    }


}
