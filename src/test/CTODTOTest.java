package test;

import java.time.LocalDate;

import org.junit.Test;

import DTO.CTODTO;
import DTO.EmpregadoDTO;

public class CTODTOTest {
	
	@Test(expected = NullPointerException.class)
	public void retornaExcessaoCasoLocalizacaoNull() {
		CTODTO dto = new CTODTO("Teste", 2016, "12345678901", 1000.0, null, 90.0);
		dto.instanciar();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaExcessaoCasoLocalizacaoForVazia() {
		CTODTO dto = new CTODTO("Teste", 2016, "12345678901", 1000.0, "", 90.0);
		dto.instanciar();
	}

}
