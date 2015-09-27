package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;

public interface CiudadDAO {
	/**
	 * Faltan comentarios
	 */
	public List<Ciudad> obtener() throws IWDaoException;
	
	public Ciudad obtener(Integer codigo) throws IWDaoException;
}
