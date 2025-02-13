package ec.webmarket.restful.api.v1;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import ec.webmarket.restful.service.crud.ProductoService;
import ec.webmarket.restful.domain.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.findAll();
    }
    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }
}

