package ec.edu.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Venta;
import ec.edu.repository.IVentaRepo;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo ventaRepo;
	
	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		
		this.ventaRepo.insertar(venta);
	}

	@Override
	public Venta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ventaRepo.buscar(id);
	}

	@Override
	public void actualizar(Venta venta) {
		// TODO Auto-generated method stub
		this.ventaRepo.actualizar(venta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ventaRepo.eliminar(id);
	}

	@Override
	public Venta buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
