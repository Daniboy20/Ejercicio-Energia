package unah.hn.lenguajes.demo.energia.repository;

import org.springframework.data.repository.CrudRepository;

import unah.hn.lenguajes.demo.energia.entities.Abonado;

public interface AbonadoRepository extends CrudRepository<Abonado,String> {
    
}
