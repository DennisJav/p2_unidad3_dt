package ec.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Producto;
import ec.edu.service.IProductosService;

@SpringBootApplication
public class P2Unidad3Dt2Application implements CommandLineRunner {

	@Autowired
	private IProductosService productosService;

	public static void main(String[] args) {
		SpringApplication.run(P2Unidad3Dt2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Producto pro1 = new Producto();

		pro1.setNombre("oreo");
		pro1.setCodigoBarras("1");
		pro1.setCategoria("dulces");
		pro1.setPrecio(new BigDecimal(1));
		pro1.setStock(new BigDecimal(25));

		this.productosService.guardar(pro1);
		
		this.productosService.actualizarStock(1, new BigDecimal(5));
		this.productosService.actualizarStockResta(1, new BigDecimal(10));
		
		
		
		this.productosService.actualizar(pro1);
		
		

		Producto pro2 = new Producto();

		pro2.setNombre("sal");
		pro2.setCodigoBarras("2");
		pro2.setCategoria("comida");
		pro2.setPrecio(new BigDecimal(3));
		pro2.setStock(new BigDecimal(50));

		this.productosService.guardar(pro2);

		this.productosService.actualizarStock(2, new BigDecimal(5));
		this.productosService.actualizarStockResta(2, new BigDecimal(10));
		
		
		
		
	}

}
