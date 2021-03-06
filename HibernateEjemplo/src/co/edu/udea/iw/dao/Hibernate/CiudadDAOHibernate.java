package co.edu.udea.iw.dao.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;

public class CiudadDAOHibernate implements CiudadDAO {

	@Override
	public List<Ciudad> obtener() throws IWDaoException {
		
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		
		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(Ciudad.class);
			
			ciudades = criteria.list();
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
		return ciudades;
	}

	@Override
	public Ciudad obtener(Integer codigo) throws IWDaoException {
			Ciudad ciudad = null;
		
		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(Ciudad.class).add(Restrictions.eq("codigo", codigo));
			
			ciudad = (Ciudad)criteria.uniqueResult();
			
			//Obtener un objeto desde hibernate con otras dos instrucciones.
			// Averiguar cuales son y cual es la que se debe usar seun las buenas practicas.
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
		return ciudad;
	}

}
