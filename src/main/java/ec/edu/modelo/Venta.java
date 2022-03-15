package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@Column(name = "ven_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_venta"))
	@SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta",allocationSize = 1)
	private Integer id;
	
	@Column(name = "ven_numero")
	private String numero;
	@Column(name="ven_fecha")
	private LocalDateTime fecha;
	@Column(name = "ven_cedula_cliente")
	private Integer cedulaCliente;

	@Column(name="ven_total_vental")
	private BigDecimal totalVenta;
	
	
	
	//realcion
	@OneToMany(mappedBy =  "venta", cascade = CascadeType.ALL)
	private List<DetalleVenta> detalleventas;
	
	@OneToMany(mappedBy =  "venta", cascade = CascadeType.ALL)
	private List<Producto> productosV;
	
	
	//Metodos set y get
	
	
	
	public List<DetalleVenta> getDetalleventas() {
		return detalleventas;
	}
	public List<Producto> getProductosV() {
		return productosV;
	}
	public void setProductosV(List<Producto> productosV) {
		this.productosV = productosV;
	}
	public void setDetalleventas(List<DetalleVenta> detalleventas) {
		this.detalleventas = detalleventas;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Integer getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(Integer cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public BigDecimal getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	
	
	
	
}
