package co.edu.udea.iw.dto;

import java.io.Serializable;

public class DireccionId implements Serializable{
	private Long Codigo;
	private Cliente cliente;
	
	public Long getCodigo() {
		return Codigo;
	}
	public void setCodigo(Long codigo) {
		Codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
