package ec.webmarket.restful.api.v1;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import ec.webmarket.restful.service.crud.FacturaCabeceraService;
import ec.webmarket.restful.domain.*;
import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaCabeceraController {
    @Autowired
    private FacturaCabeceraService facturaCabeceraService;

    @GetMapping
    public List<FacturaCabecera> getAll() {
        return facturaCabeceraService.findAll();
    }
    @PostMapping
    public FacturaCabecera create(@RequestBody FacturaCabecera facturaCabecera) {
        return facturaCabeceraService.save(facturaCabecera);
    }
}
