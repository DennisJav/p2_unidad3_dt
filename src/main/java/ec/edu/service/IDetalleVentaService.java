package ec.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.modelo.DetalleVenta;
import ec.edu.modelo.Producto;
import ec.edu.modelo.Venta;

public interface IDetalleVentaService {
	void nuevaVenta(DetalleVenta detalleVenta);

	List<DetalleVenta> buscarProductos( LocalDateTime fecha);
	
	void realizarVenta(String codigo, Integer cantidad, String cedula, String numeroVenta);
	
}
