package atividades.atv07;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.EntidadeBase;

@Entity
@Table(name="USUARIO")
public class Usuario implements EntidadeBase {
@EmbeddedId
private UsuarioId id;
private String nome;
private String cpf;
@Override
public Object getPK() {
	// TODO Auto-generated method stub
	return 0 ;
}
public UsuarioId getId() {
	return id;
}
public void setId(UsuarioId id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}

}
