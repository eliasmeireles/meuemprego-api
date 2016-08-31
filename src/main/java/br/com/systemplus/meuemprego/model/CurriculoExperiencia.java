package br.com.systemplus.meuemprego.model;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "curriculo_experiencia")
public class CurriculoExperiencia {

	protected String empresa;
	protected String funcao;
	protected Date dataInicio;
	protected Date dataFim;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
