package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Identidade {

	public Identidade() {
		super();
	}

	public Identidade(String nIdentidade, String nome, String cpf, String dataNascimento, String orgaoEmissor,
			String dataEmissao) {
		super();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		Date dtN = null;
		try {
			dtN = formato.parse(dataNascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		Date dtE = null;
		try {
			dtE = formato.parse(dataEmissao);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.nIdentidade = nIdentidade;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dtN;
		this.orgaoEmissor = orgaoEmissor;
		this.dataEmissao = dtE;
	}

	private String nIdentidade;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String orgaoEmissor;
	private Date dataEmissao;

	public String getnIdentidade() {
		return nIdentidade;
	}

	public void setnIdentidade(String nIdentidade) {
		this.nIdentidade = nIdentidade;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}
