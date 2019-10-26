package test;

import org.junit.Test;

import DTO.EmpregadoDTO;

public class EmpregadoDTOTest {
	
	
	@Test(expected = NullPointerException.class)
	public void retornaExcessaoQuandoNomeNulo() {
		EmpregadoDTO dto = new EmpregadoDTO(null, 2016, "12345678912", 1000.0);
		dto.instanciar();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoQuandoNomeForVazio() {
		EmpregadoDTO dto = new EmpregadoDTO("", 2016, "12345678912", 1000.0);
		dto.instanciar();
		
	}
	
	
	@Test(expected = NullPointerException.class)
	public void retornaExcessaoQuandoCpfNulo() {
		EmpregadoDTO dto = new EmpregadoDTO("Empregado", 2016, null, 1000.0);
		dto.instanciar();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoQuandoCpfForInvalido() {
		EmpregadoDTO dto = new EmpregadoDTO("Empregado", 2016, "123", 1000.0);
		dto.instanciar();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoCasoAdmissaoForAntesDe2015() {
		EmpregadoDTO dto = new EmpregadoDTO("Empregado", 2014, "123", 1000.0);
		dto.instanciar();
	}
	
}
