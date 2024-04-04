package unah.hn.lenguajes.demo.energia.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "facturacion")
@Data
public class Facturacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fechafacturacion")
    private LocalDate fechaFacturacion;

    @Column(name = "kwsconsumidos")
    private double kwsConsumidos;

    @Column(name = "totalfacturacion")
    private double totalFacturacion;


    @OneToOne
    @JoinColumn(name = "dni", referencedColumnName= "dni")
    private Abonado abonado;

}
