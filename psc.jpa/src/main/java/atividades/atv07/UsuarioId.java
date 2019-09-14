package atividades.atv07;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UsuarioId implements Serializable {
private int id;
private int empresa;
public UsuarioId() {}
public UsuarioId(int id,int empresa) {
	this.id = id;
	this.empresa =empresa;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getEmpresa() {
	return empresa;
}
public void setEmpresa(int empresa) {
	this.empresa = empresa;
}
}
