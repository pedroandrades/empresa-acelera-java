package Funcionario;

public class Coordenador extends Empregado {
	public String departamento;
	public Integer funcionariosLigados;

	public Coordenador(String nome, Integer dataAdmissao, String cpf, double salario, String departamento,
			Integer funcionariosLigados) {
		super(nome, dataAdmissao, cpf, salario);
		this.departamento = departamento;
		this.funcionariosLigados = funcionariosLigados;
	}
}
