package unah.hn.lenguajes.demo.energia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tiporesidencia")
@Data
public class TipoResidencia {
    
    @Id
    @Column(name = "idtiporesidencia")
    private long idTipoResidencia;

    private String descripcion;

    @Column(name = "preciokw")
    private double precioKw;



}
