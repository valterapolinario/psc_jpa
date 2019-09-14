package atividades.atv08;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Pet {
   @Id
   private int id;
 
   @OneToOne(mappedBy="petId")
   private Pessoa pessoa;
   @Column(name = "NomePet")
   private String nome;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Pessoa getPessoa() {
	return pessoa;
}

public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
 
}