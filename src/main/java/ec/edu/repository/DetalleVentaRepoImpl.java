package ec.edu.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.DetalleVenta;


@Transactional
@Repository
public class DetalleVentaRepoImpl implements IDetalleVentaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<DetalleVenta> buscarProductos(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
		TypedQuery<DetalleVenta> miQuery = this.entityManager
				.createQuery("select d from DetalleVenta f where f.fecha = :valor",DetalleVenta.class);

		miQuery.setParameter("valor", fecha);

		List<DetalleVenta> listaDetalles = miQuery.getResultList();
		
		return listaDetalles;
	}

	@Override
	public void ventaNueva(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalleVenta);
	}

	
}
