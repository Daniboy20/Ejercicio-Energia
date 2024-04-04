package unah.hn.lenguajes.demo.energia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.demo.energia.entities.Abonado;
import unah.hn.lenguajes.demo.energia.repository.AbonadoRepository;
import unah.hn.lenguajes.demo.energia.service.AbonadoService;

@Service
public class AbonadoServiceImpl implements AbonadoService {

    @Autowired
    private AbonadoRepository abonadoRepository;

    @Override
    public Abonado crearAbonado(Abonado abonado) {
        return this.abonadoRepository.save(abonado);
    }

    @Override
    public String eliminarAbonado(String dni) {

        if (this.abonadoRepository.existsById(dni))
        {
            this.abonadoRepository.deleteById(dni);
            return "Abonado Eliminado Con Exito";
        }
        return "Abonado No Se Encontro";
    }

    @Override
    public Abonado obtenerAbonado(String dni) {

        if (this.abonadoRepository.existsById(dni))
        {
            return this.abonadoRepository.findById(dni).get();
        }
        return null;
       
    }
    
}
