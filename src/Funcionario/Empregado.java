package Funcionario;

import java.time.LocalDate;

public class Empregado {
	private String nome;
	private Integer dataAdmissao;
	private String cpf;
	private double salario;
	
	public Empregado(String nome, Integer dataAdmissao, String cpf, double salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.cpf = cpf;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Integer dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
