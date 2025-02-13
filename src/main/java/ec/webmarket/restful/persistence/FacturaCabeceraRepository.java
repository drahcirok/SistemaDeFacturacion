package ec.webmarket.restful.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.webmarket.restful.domain.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaCabeceraRepository extends JpaRepository<FacturaCabecera, Long> {
    @Query("SELECT f FROM FacturaCabecera f")
    List<FacturaCabecera> obtenerTodasLasFacturas();
}