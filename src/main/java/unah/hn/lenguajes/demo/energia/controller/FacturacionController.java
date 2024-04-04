package unah.hn.lenguajes.demo.energia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.demo.energia.entities.Facturacion;
import unah.hn.lenguajes.demo.energia.service.impl.FacturacionServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/facturacion")
public class FacturacionController {
    
    @Autowired
    private FacturacionServiceImpl facturacionServiceImpl;

    @PostMapping("/crear")
    public Facturacion crearFacturacion(@RequestBody Facturacion facturacion) {
       return this.facturacionServiceImpl.crearFacturacion(facturacion);
    }
    


}
