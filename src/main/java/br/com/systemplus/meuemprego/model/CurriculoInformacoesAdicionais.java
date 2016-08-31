package br.com.systemplus.meuemprego.model;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "curriculo_informacoes_adicionais")
public class CurriculoInformacoesAdicionais {

	protected String conhecimento;

	public String getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(String conhecimento) {
		this.conhecimento = conhecimento;
	}
}
