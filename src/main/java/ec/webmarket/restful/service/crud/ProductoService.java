package ec.webmarket.restful.service.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.webmarket.restful.domain.*;
import ec.webmarket.restful.persistence.*;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> findAll() {
        return productoRepository.obtenerTodosLosProductos();
    }
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}
