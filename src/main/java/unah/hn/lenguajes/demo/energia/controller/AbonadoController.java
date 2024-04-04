package unah.hn.lenguajes.demo.energia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.demo.energia.entities.Abonado;
import unah.hn.lenguajes.demo.energia.service.impl.AbonadoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/abonado")
public class AbonadoController {
    
    @Autowired
    private AbonadoServiceImpl abonadoServiceImpl;

    @PostMapping("/crear")
    public Abonado crearAbonado(@RequestBody Abonado abonado) {
        return this.abonadoServiceImpl.crearAbonado(abonado);
    }
    

    @DeleteMapping("/eliminar")
    public String eliminarAbonado(@RequestParam String dni) {
        return this.abonadoServiceImpl.eliminarAbonado(dni);
    }

    @GetMapping("/obtener")
    public Abonado obtenerAbonado(@RequestParam String dni) {
        return this.abonadoServiceImpl.obtenerAbonado(dni);
    }
    


}
