package DTO;

import Funcionario.Coordenador;

public class CoordenadorDTO extends EmpregadoDTO {
	public String departamento;
	public Integer funcionariosLigados;
	public CoordenadorDTO(String nome, Integer dataAdmissao, String cpf, double salario, String departamento,
			Integer funcionariosLigados) {
		super(nome, dataAdmissao, cpf, salario);
		this.departamento = departamento;
		this.funcionariosLigados = funcionariosLigados;
	}
	
	@Override
	public Coordenador instanciar() {
		super.validar();
		validarFuncionariosLigados();
		validarDepartamento();
		return new Coordenador(nome, dataAdmissao, cpf, salario, departamento, funcionariosLigados);
	}
	
	
	public void validarFuncionariosLigados() {
		if(funcionariosLigados == null) {
			throw new NullPointerException();
		}
		else if(funcionariosLigados == 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public void validarDepartamento() {
		if(departamento == null) {
			throw new NullPointerException();
		}
		else if(departamento.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}
}
