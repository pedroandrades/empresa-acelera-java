package DTO;

import Funcionario.CTO;

public class CTODTO extends EmpregadoDTO{
	
	private String localizacao;
	private Double bonusAnual;
	
	public CTODTO(String nome, Integer dataAdmissao, String cpf, double salario, String localizacao,
			Double bonusAnual) {
		super(nome, dataAdmissao, cpf, salario);
		this.localizacao = localizacao;
		this.bonusAnual = bonusAnual;
	}

	public CTO instanciar() {
		super.validar();
		validarLocalizacao();
		return new CTO(nome, dataAdmissao, cpf, salario, localizacao, bonusAnual);
	}
	
	public void validarLocalizacao() {
		if(localizacao == null) {
			throw new NullPointerException();
		}
		if(localizacao.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}
	
}
