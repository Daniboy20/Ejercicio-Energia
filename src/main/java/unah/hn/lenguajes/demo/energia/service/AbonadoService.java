package unah.hn.lenguajes.demo.energia.service;

import unah.hn.lenguajes.demo.energia.entities.Abonado;

public interface AbonadoService {
    
    public Abonado crearAbonado(Abonado abonado);

    public String eliminarAbonado(String dni);

    public Abonado obtenerAbonado(String dni);

}
