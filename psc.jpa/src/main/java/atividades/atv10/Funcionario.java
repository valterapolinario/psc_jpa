package atividades.atv10;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import model.EntidadeBase;
@Entity
public class Funcionario implements EntidadeBase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Matricula")
	private int idFuncionario;
	@Column(name="nFuncionario")
	String nome ;
	@Override
	public Object getPK() {
		return 0;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
