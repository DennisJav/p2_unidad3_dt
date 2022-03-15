package ec.edu.repository;

import ec.edu.modelo.Producto;

public interface IProductoRepo {

	void insertar(Producto producto);

	Producto buscar(Integer id);
	
	void actualizar(Producto producto);
	
	void eliminar(Integer id);
	
	void actualizarStock(Producto producto);
	
	Producto buscarCodigo(String codigo);
	
}
