package ec.edu.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

	@Id
	@Column(name = "det_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_detalle_venta"))
	@SequenceGenerator(name = "seq_detalle_venta", sequenceName = "seq_detalle_venta",allocationSize = 1)
	private Integer id;
	
	@Column(name = "det_cantidad")
	private Integer cantida;
	@Column(name = "det_precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name="det_subtotal")
	private BigDecimal subtotal;

	//relaciones
	
	@ManyToOne
	@JoinColumn(name = "ven_id")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Producto producto;

	
	//metodos set y get
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantida() {
		return cantida;
	}

	public void setCantida(Integer cantida) {
		this.cantida = cantida;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
	
}
