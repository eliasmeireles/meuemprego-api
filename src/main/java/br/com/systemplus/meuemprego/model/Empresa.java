package br.com.systemplus.meuemprego.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "empresa")
public class Empresa extends BaseEntity<Empresa> {

	protected static final long serialVersionUID = 1L;

	protected Endereco endereco;
	protected Usuario usuario;
	protected String nome;
	protected String cnpj;
	protected Date dataCadastro;

	@NotNull
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "endereco_id")
	@RestResource(exported = false)
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@NotNull
	@ManyToOne(optional = false)
	@JoinColumn(name = "usuario_id", nullable = false)
	@RestResource(exported = false)
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public void updateBasedOn(Empresa target) {
	}

	@PrePersist
	public void prepareToSave() {
	}
}
