package br.com.systemplus.meuemprego.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "curriculo")
public class Curriculo extends BaseEntity<Curriculo> {

	protected static final long serialVersionUID = 1L;

	protected Usuario usuario;
	protected String estadoCivil;
	protected String celular;
	protected String telefoneResidencial;
	protected String objetivo;
	protected Date dataCadastro;
	protected Date dataDeAtualizacao;
	protected List<CurriculoExperiencia> curriculoExperiencia;
	protected List<CurriculoFormacao> curriculoFormacao;
	protected List<CurriculoInformacoesAdicionais> informacoesAdicionais;

	@NotNull
	@OneToOne(optional = false)
	@JoinColumn(name = "usuario_id", nullable = false)
	@RestResource(exported = false)
	@JsonBackReference
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
	
	@ElementCollection
	@CollectionTable(name = "curriculo_experiencia", joinColumns = @JoinColumn(name = "curriculo_id"))
	public List<CurriculoExperiencia> getCurriculoExperiencia() {
		return curriculoExperiencia;
	}

	public void setCurriculoExperiencia(List<CurriculoExperiencia> curriculoExperiencia) {
		this.curriculoExperiencia = curriculoExperiencia;
	}

	@ElementCollection
	@CollectionTable(name = "curriculo_formacao", joinColumns = @JoinColumn(name = "curriculo_id"))
	public List<CurriculoFormacao> getCurriculoFormacao() {
		return curriculoFormacao;
	}

	public void setCurriculoFormacao(List<CurriculoFormacao> curriculoFormacao) {
		this.curriculoFormacao = curriculoFormacao;
	}

	@ElementCollection
	@CollectionTable(name = "curriculo_informacoes_adicionais", joinColumns = @JoinColumn(name = "curriculo_id"))
	public List<CurriculoInformacoesAdicionais> getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(List<CurriculoInformacoesAdicionais> informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	@Override
	public void updateBasedOn(Curriculo target) {

	}

}
