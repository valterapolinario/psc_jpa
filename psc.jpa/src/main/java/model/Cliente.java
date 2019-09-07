package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements EntidadeBase {
private int Id;
private Identidade identidade;
private int nTelefone;
private String email;
public Object getPK() {
	// TODO Auto-generated method stub
	return 0;
}
public Identidade getIdentidade() {
	return identidade;
}
public void setIdentidade(Identidade identidade) {
	this.identidade = identidade;
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
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}



}



