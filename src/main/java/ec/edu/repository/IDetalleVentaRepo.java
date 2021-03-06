package ec.edu.repository;


import java.time.LocalDateTime;
import java.util.List;

import ec.edu.modelo.DetalleVenta;

public interface IDetalleVentaRepo {

	void ventaNueva(DetalleVenta detalleVenta);
	
	List<DetalleVenta> buscarProductos( LocalDateTime fecha);
	
}
