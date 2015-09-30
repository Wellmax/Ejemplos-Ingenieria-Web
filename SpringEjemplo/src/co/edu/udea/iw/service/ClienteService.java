package co.edu.udea.iw.service;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;

public class ClienteService {
	
	private ClienteDAO clienteDAO;
	private UsuarioDAO usuarioDAO;
	/**
	 * 
	 * @param cedula
	 * @param nombres
	 * @param apellidos
	 * @param correoelectronico
	 * @param usuarioCrea
	 * @throws IWDaoException
	 * 
	 * Lo reconedable es crear una interfaz ojo con este ejemplo.
	 */
	public void guardaCliente(String cedula, String nombres, String apellidos, String correoelectronico, String usuarioCrea) throws IWDaoException, IWServiceException{
		if(cedula ==  null && "".equals(cedula)){
			throw new IWServiceException("La cedula del cliente no puede ser nula, ni una cadena de caracteres vacia");
		}
		if(nombres ==  null && "".equals(nombres)){
			throw new IWServiceException("El nombre del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(nombres ==  null && "".equals(nombres)){
			throw new IWServiceException("El nombre del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(nombres ==  null && "".equals(nombres)){
			throw new IWServiceException("El nombre del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(nombres ==  null && "".equals(nombres)){
			throw new IWServiceException("El nombre del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
	}

}
