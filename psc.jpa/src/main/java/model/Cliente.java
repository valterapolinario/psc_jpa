package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements EntidadeBase {
	
	public Cliente() {
		this.identidade = new Identidade();
		
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Embedded
	private Identidade identidade;
	private int nTelefone;
	private String email;
	//@Embedded
	//private ContaLogin contaCliente;

	public Object getPK() {
		// TODO Auto-generated method stub
		return 0;

	}

	public int getnTelefone() {
		return nTelefone;
	}

	public void setnTelefone(int nTelefone) {
		this.nTelefone = nTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}


	public Identidade getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Identidade identidade) {
		this.identidade = identidade;
	}
	

}
