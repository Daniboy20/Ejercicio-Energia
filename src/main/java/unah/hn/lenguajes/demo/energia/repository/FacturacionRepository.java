package unah.hn.lenguajes.demo.energia.repository;

import org.springframework.data.repository.CrudRepository;

import unah.hn.lenguajes.demo.energia.entities.Facturacion;

public interface FacturacionRepository extends CrudRepository<Facturacion,Long>{
    
}
