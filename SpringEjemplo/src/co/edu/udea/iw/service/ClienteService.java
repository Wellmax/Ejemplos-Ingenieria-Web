package co.edu.udea.iw.service;

import java.util.Date;
import java.util.List;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;
import co.edu.udea.iw.util.validaciones.Validaciones;

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
	public void guardaCliente(String cedula, String nombres, String apellidos,
			String correoelectronico, String usuarioCrea) throws IWDaoException, IWServiceException{
		Cliente cliente = null;
		
		if(Validaciones.isTextoVacio(cedula)){
			throw new IWServiceException("La cedula del cliente no puede ser nula, ni una cadena de caracteres vacia");
		}
		if(Validaciones.isTextoVacio(nombres)){
			throw new IWServiceException("El nombre del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(Validaciones.isTextoVacio(apellidos)){
			throw new IWServiceException("Los apellidos del cliente no puede ser nulos, ni una cadena de caracteres vacia");
		}
		if(Validaciones.isTextoVacio(correoelectronico)){
			throw new IWServiceException("El correo del cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(Validaciones.isTextoVacio(usuarioCrea)){
			throw new IWServiceException("El usuario que crea el cliente no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if(!Validaciones.isEmail(correoelectronico)){
			throw new IWServiceException("El correo electrónico del cliente debe ser válido");
		}
		
		Usuario usuario = usuarioDAO.obtener(usuarioCrea);
		if(usuario == null){
			throw new IWServiceException("El usuario que crea el cliente debe ser un usuario del sistema");
		}
		
		cliente = new Cliente();
		
		cliente.setCedula(cedula);
		cliente.setNombres(nombres);
		cliente.setApellidos(apellidos);
		cliente.setCorreo(correoelectronico);
		cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(false);
		
		clienteDAO.insertar(cliente);
		
		
	}
	
	public List<Cliente> obtener() throws IWDaoException{
		return clienteDAO.obtener();
	}
	public Cliente obtener(String cedula) throws IWDaoException, IWServiceException{
		if(cedula == null && "".equals(cedula)){
			throw new IWServiceException("La cedula del cliente a buscar no puede ser nula, ni una cadena de caracteres vacia");
		}
		return clienteDAO.obtener(cedula);
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	

}
