package ec.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.DetalleVenta;
import ec.edu.modelo.Producto;


@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto el = this.buscar(id);
		this.entityManager.remove(el);
	}


	
	@Override
	@Transactional(value = TxType.SUPPORTS)
	public void actualizarStock(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		TypedQuery<DetalleVenta> miQuery = this.entityManager
				.createQuery("select d from Producto f where f.codigoBarras = :valor",DetalleVenta.class);

		miQuery.setParameter("valor", codigo);

		return (Producto) miQuery.getResultList();

	}

	
	
	
}
