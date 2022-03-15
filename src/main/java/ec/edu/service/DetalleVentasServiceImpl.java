package ec.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.DetalleVenta;
import ec.edu.modelo.Producto;
import ec.edu.modelo.Venta;
import ec.edu.repository.IDetalleVentaRepo;

@Service
public class DetalleVentasServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaRepo detalleVentaRepo;
	
	@Autowired
	private IVentaService ventaService;
	
	@Autowired
	private IProductosService productosService;
	
	@Override
	public List<DetalleVenta> buscarProductos(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
		
		return null;
	}


	

	@Override
	public void nuevaVenta(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleVentaRepo.ventaNueva(detalleVenta);
	}

	@Override
	@Transactional
	public void realizarVenta(String codigo, Integer cantidad, String cedula, String numeroVenta) {
		// TODO Auto-generated method stub
		
		Producto vender = this.productosService.buscarCodigo(codigo);
		Integer cant = vender.getStock().intValueExact();
		
		if(vender == null || cant > 0) {
			
			Venta v =  new Venta();
			v.setNumero(numeroVenta);
			v.setCedulaCliente(cedula);
			v.setFecha(LocalDateTime.now());
			v.setTotalVenta(vender.getPrecio().multiply(new BigDecimal((cantidad <- vender.getStock().intValueExact()) ? cantidad : vender.getStock().intValueExact())));
		}
		
		
	}

	
	
	
}
