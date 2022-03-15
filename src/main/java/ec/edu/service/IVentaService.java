package ec.edu.service;

import java.time.LocalDateTime;

import ec.edu.modelo.Venta;

public interface IVentaService {


	void insertar(Venta venta);

	Venta buscar(Integer id);
	
	void actualizar(Venta venta);
	
	void eliminar(Integer id);
	
	Venta buscarPorFecha(LocalDateTime fecha);
	
}
