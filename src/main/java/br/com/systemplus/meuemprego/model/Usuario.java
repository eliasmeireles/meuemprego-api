package br.com.systemplus.meuemprego.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.rest.core.annotation.RestResource;

import br.com.systemplus.meuemprego.security.PasswordEncryptor;

@Entity
@Table(name = "usuario")
public class Usuario extends BaseEntity<Usuario> {

	protected static final long serialVersionUID = 1L;

	protected Endereco endereco;
	protected String nome;
	protected String email;
	protected String salt;
	protected String token;
	protected String senha;
	protected Date dataCadastro;
	protected Date dataDeAtualizacao;

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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

	public Date getDataDeAtualizacao() {
		return dataDeAtualizacao;
	}

	public void setDataDeAtualizacao(Date dataDeAtualizacao) {
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	@Override
	public void updateBasedOn(Usuario target) {
		target.nome = this.nome;
		target.email = this.email;
		target.salt = this.salt;
		target.token = this.token;
		target.senha = this.senha;
		target.dataCadastro = this.dataCadastro;
	}

	@PrePersist
	public void prepareToSave() {
		Map<String, String> map = PasswordEncryptor.encrypt("senha");
		salt = map.get(PasswordEncryptor.SALT_KEY);
		senha = map.get(PasswordEncryptor.PASSWORD_KEY);
	}
}
