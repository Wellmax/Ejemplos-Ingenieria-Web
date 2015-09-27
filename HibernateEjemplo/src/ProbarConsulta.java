import java.util.Date;
import java.util.List;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.Hibernate.CiudadDAOHibernate;
import co.edu.udea.iw.dao.Hibernate.ClienteDAOHibernate;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

public class ProbarConsulta {
	
	public static void main(String[] args) {
		
		/*CiudadDAO ciudadDao = null;
		try {
			ciudadDao = new CiudadDAOHibernate();
			
			List<Ciudad> ciudades = ciudadDao.obtener();
			for(Ciudad ciudad : ciudades){
				System.out.println("Nombre cuidad: " + ciudad.getNombre());
			}
		} catch (IWDaoException e) {
			System.out.println(e.getMessage());
		}*/
		
		//Como es el ingreso teniendo claves foraneas
		
		/*ClienteDAO dao = new ClienteDAOHibernate();
		try {
			Cliente cliente = new Cliente();
			
			cliente.setCedula("1025325245");
			cliente.setNombres("Luisa Fernanda");
			cliente.setApellidos("Rodriguez Hernandez");
			cliente.setCorreo("pruebacorreo1@gmail.com");
			cliente.setUsuarioCrea(new Usuario().setNombres("duvan"));
			cliente.setFechaCreacion(new Date());
			
			dao.insertar(cliente);
		} catch (IWDaoException e) {
			System.out.println(e.getMessage());
		}*/
	}

}
