package ec.webmarket.restful.dto.v1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FacturaCabeceraDTO {
    private Long clienteId;
    private LocalDateTime fecha;
    private BigDecimal total;

    // Getters y Setters
    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
}