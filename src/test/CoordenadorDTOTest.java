package test;

import org.junit.Test;

import DTO.CoordenadorDTO;

public class CoordenadorDTOTest extends EmpregadoDTOTest{

	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoCasoNaoTenhaNenhumFuncionario() {
		CoordenadorDTO dto = new CoordenadorDTO("coordenador", 2016, 
									"12345678912", 10000.0, "departamento", 0);
		
		dto.instanciar();
		
	}
	
	@Test(expected = NullPointerException.class)
	public void retornaExcessaoCasoFuncionariosNull() {
		CoordenadorDTO dto = new CoordenadorDTO("coordenador", 2016, 
				"12345678912", 10000.0, "departamento", null);
		dto.instanciar();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoCasoNaoTenhaNenhumDepartamento() {
		CoordenadorDTO dto = new CoordenadorDTO("coordenador", 2016, 
				"12345678912", 10000.0, "", 7);
		dto.instanciar();
		
	}
	
	@Test(expected = NullPointerException.class)
	public void retornaExcessaoCasoDepartamentoNull() {
		CoordenadorDTO dto = new CoordenadorDTO("coordenador", 2016, 
				"12345678912", 10000.0, null, 2);
		dto.instanciar();
		
	}
}
