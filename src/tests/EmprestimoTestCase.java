package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class EmprestimoTestCase {

	Emprestimo e = new Emprestimo();
	
	@Test
	void testGetSet() {
		Date data = new Date();
		
		e.setDataEmprestimo(data);
		
		assertEquals(data, e.getDataEmprestimo());
	}
}
