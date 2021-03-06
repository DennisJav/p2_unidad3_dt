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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_producto"))
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto",allocationSize = 1)
	private Integer id;
	
	@Column(name = "prod_codigo_barras")
	private String codigoBarras;
	@Column(name = "prod_nombre")
	private String nombre;
	@Column(name="prod_categoria")
	private String categoria;
	@Column(name = "prod_stock")
	private BigDecimal stock;
	@Column(name="prod_precio")
	private BigDecimal precio;
	
	
	//relaciones
	@OneToMany(mappedBy =  "producto", cascade = CascadeType.ALL)
	private List<DetalleVenta> detalleventas;
	

	
	//metodos set y get
	
	
	
	
	public List<DetalleVenta> getDetalleventas() {
		return detalleventas;
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
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public BigDecimal getStock() {
		return stock;
	}
	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	

}
