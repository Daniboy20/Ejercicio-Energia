package unah.hn.lenguajes.demo.energia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="abonado")
public class Abonado {
    
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    @OneToOne
    @JoinColumn(name = "idtiporesidencia", referencedColumnName = "idtiporesidencia")
    private TipoResidencia tipoResidencia;

    
}
