package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Reserva implements EntidadeBase {
	public Reserva() {
		this.cliente = new Cliente();
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReserva;
	@OneToOne
	private Cliente cliente;
	private int npessoas;
	private Date dataReserva;
	private Date fimReserva;
	private Double preco;
	public Object getPK() {
		
		return 0;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNpessoas() {
		return npessoas;
	}
	public void setNpessoas(int npessoas) {
		this.npessoas = npessoas;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getFimReserva() {
		return fimReserva;
	}
	public void setFimReserva(Date fimReserva) {
		this.fimReserva = fimReserva;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
