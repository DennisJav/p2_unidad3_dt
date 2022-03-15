package ec.edu.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Producto;
import ec.edu.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductosService{

	@Autowired
	private IProductoRepo productoRepo;

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscar(id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizar(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.eliminar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizarStock(Integer id, BigDecimal productosNuevo) {
		// TODO Auto-generated method stub
		
		Producto productoOrig = this.buscar(id);

		BigDecimal nuevoProducto = productoOrig.getStock().add(productosNuevo);
        productoOrig.setStock(nuevoProducto);
        
        this.actualizar(productoOrig);

	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizarStockResta(Integer id, BigDecimal cantidadNueva) {
		// TODO Auto-generated method stub
		Producto productoOrig = this.buscar(id);

		BigDecimal nuevoProducto = productoOrig.getStock().subtract(cantidadNueva);
        productoOrig.setStock(nuevoProducto);
        
        this.actualizar(productoOrig);
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		
		
		return this.productoRepo.buscarCodigo(codigo);
	}
	
	
	
	
	
}
