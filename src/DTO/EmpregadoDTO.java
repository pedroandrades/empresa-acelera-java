package DTO;

import java.time.LocalDate;

import Funcionario.Empregado;

public class EmpregadoDTO {
	protected String nome;
	protected Integer dataAdmissao;
	protected String cpf;
	protected double salario;
	
	
	public EmpregadoDTO(String nome, Integer dataAdmissao, String cpf, double salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	protected void validar() {
		validarNome();
		validarCpf();
	}
	
	public Empregado instanciar() {
		validar();
		return new Empregado(nome, dataAdmissao, cpf, salario);
	}
	
	public void validarNome() {
		if(nome == null) {
			throw new NullPointerException();
		}else if(nome.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}
	public void validarCpf() {
		if(cpf == null) {
			throw new NullPointerException();
		} else if(cpf.length() != 11) {
			throw new IllegalArgumentException();
		}
	}

	
}
