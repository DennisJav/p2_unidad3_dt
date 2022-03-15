package ec.edu.service;

import java.math.BigDecimal;

import ec.edu.modelo.Producto;

public interface IProductosService {


	void guardar(Producto producto);

	Producto buscar(Integer id);
	
	void actualizar(Producto producto);
	
	void eliminar(Integer id);
	
	void actualizarStock(Integer id,BigDecimal cantidadNueva);
	
	void actualizarStockResta(Integer id,BigDecimal cantidadNueva);
	
	Producto buscarCodigo(String codigo);
	
}
