package ec.webmarket.restful.service.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.FacturaCabecera;
import ec.webmarket.restful.persistence.FacturaCabeceraRepository;

import java.util.List;
import java.util.Optional;


@Service
public class FacturaCabeceraService {
    @Autowired
    private FacturaCabeceraRepository facturaCabeceraRepository;
    
    public List<FacturaCabecera> findAll() {
        return facturaCabeceraRepository.obtenerTodasLasFacturas();
    }
    public Optional<FacturaCabecera> findById(Long id) {
        return facturaCabeceraRepository.findById(id);
    }
    public FacturaCabecera save(FacturaCabecera facturaCabecera) {
        return facturaCabeceraRepository.save(facturaCabecera);
    }
    public void deleteById(Long id) {
        facturaCabeceraRepository.deleteById(id);
    }
}
