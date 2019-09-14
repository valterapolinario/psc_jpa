package atividades.atv08;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.EntidadeBase;

@Entity
public class Pessoa implements EntidadeBase {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
 
   @OneToOne()
   private Pet petId;
   @Column(name = "NomePessoa")
   private String nome;

@Override
public Object getPK() {
	// TODO Auto-generated method stub
	return 0 ;
}

public int getId() {
	return id;
}

public void setId(int i) {
	this.id = i;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Pet getPetId() {
	return petId;
}

public void setPetId(Pet petId) {
	this.petId = petId;
}
}
