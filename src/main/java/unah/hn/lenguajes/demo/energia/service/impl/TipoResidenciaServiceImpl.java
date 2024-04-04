package unah.hn.lenguajes.demo.energia.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.demo.energia.entities.TipoResidencia;
import unah.hn.lenguajes.demo.energia.repository.TipoResidenciaRepository;
import unah.hn.lenguajes.demo.energia.service.TipoResidenciaService;

@Service
public class TipoResidenciaServiceImpl implements TipoResidenciaService {

    @Autowired
    private TipoResidenciaRepository tipoResidenciaRepository;

    @Override
    public TipoResidencia crearTipoResidencia(TipoResidencia tipoResidencia) {
       
        List<TipoResidencia> residencias = (List<TipoResidencia>) this.tipoResidenciaRepository.findAll();

        int vueltas = residencias.size();
        System.out.println(tipoResidencia.getDescripcion());
        System.out.println(residencias);
        if (tipoResidencia.getDescripcion().matches(("(bodega|residencial|edificio)")))
        {
            if (residencias.size() == 0) {
                 return this.tipoResidenciaRepository.save(tipoResidencia);
            }
            else
            {
                for (int i=1; i<=vueltas;i++) {

                    if(!tipoResidencia.getDescripcion().equals(residencias.get(i-1).getDescripcion()))
                    {
                        if(i == vueltas)
                        {
                            return this.tipoResidenciaRepository.save(tipoResidencia);
                        }
                        
                    }
                }
            }
            
        }
        return null;
    }
    
}
