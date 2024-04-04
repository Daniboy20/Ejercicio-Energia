package unah.hn.lenguajes.demo.energia.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.demo.energia.entities.Abonado;
import unah.hn.lenguajes.demo.energia.entities.Facturacion;
import unah.hn.lenguajes.demo.energia.repository.AbonadoRepository;
import unah.hn.lenguajes.demo.energia.repository.FacturacionRepository;
import unah.hn.lenguajes.demo.energia.service.FacturacionService;

@Service
public class FacturacionServiceImpl implements FacturacionService{

    @Autowired
    private FacturacionRepository facturacionRepository;

    @Autowired
    private AbonadoRepository abonadoRepository;

    @Override
    public Facturacion crearFacturacion(Facturacion facturacion) {
        
        String dni = facturacion.getAbonado().getDni();

        if(this.abonadoRepository.existsById(dni))
        {
            Abonado abonado = this.abonadoRepository.findById(dni).get();
            facturacion.setAbonado(abonado);
            LocalDate fechaFacturacion = LocalDate.now();
            facturacion.setFechaFacturacion(fechaFacturacion);

            facturacion.setTotalFacturacion(abonado.getTipoResidencia().getPrecioKw() * facturacion.getKwsConsumidos());
            return this.facturacionRepository.save(facturacion);

        }
        return null;

    }
    
}
