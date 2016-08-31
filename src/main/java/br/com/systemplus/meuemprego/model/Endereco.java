package br.com.systemplus.meuemprego.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "endereco")
public class Endereco extends BaseEntity<Endereco> {

	protected static final long serialVersionUID = 1L;

	protected Estado estado;
	protected String cep;
	protected String logradouro;
	protected String numero;
	protected String complemento;
	protected String bairro;
	protected String cidade;

	@NotNull
	@ManyToOne(cascade = { CascadeType.DETACH })
	@JoinColumn(name = "estado_id")
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public void updateBasedOn(Endereco target) {
	}

	@PrePersist
	public void prepareToSave() {
	}
}
