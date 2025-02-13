package ec.webmarket.restful.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import ec.webmarket.restful.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query("SELECT c FROM Cliente c")
    List<Cliente> obtenerTodosLosClientes();
}
