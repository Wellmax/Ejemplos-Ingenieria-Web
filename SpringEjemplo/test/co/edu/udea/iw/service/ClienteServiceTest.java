package co.edu.udea.iw.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")
public class ClienteServiceTest {
	
	@Autowired
	ClienteService clienteService;
	
	@Test
	public void testGuardaCliente(){
		try {
			clienteService.guardaCliente("192938380", "Cliente", "Prueba", "mal@correo.com", "ere");
		} catch (IWDaoException | IWServiceException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
