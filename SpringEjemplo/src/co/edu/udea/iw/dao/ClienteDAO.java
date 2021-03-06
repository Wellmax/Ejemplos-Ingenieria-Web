package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;

public interface ClienteDAO {
	
	public Cliente insertar(Cliente cliente) throws IWDaoException;
	
	public Cliente modificar(Cliente cliente) throws IWDaoException;
	
	public void eliminar(Cliente cliente) throws IWDaoException;
	
	public List<Cliente> obtener() throws IWDaoException;
	
	public Cliente obtener(String cedula) throws IWDaoException;

}
