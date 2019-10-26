package Funcionario;

import java.time.LocalDate;

public class CTO extends Empregado{
	
	private String localizacao;
	private Double bonusAnual;
	
	public CTO(String nome, Integer dataAdmissao, String cpf, double salario, String localizacao,
			Double bonusAnual) {
		super(nome, dataAdmissao, cpf, salario);
		this.localizacao = localizacao;
		this.bonusAnual = bonusAnual;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(Double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
}
