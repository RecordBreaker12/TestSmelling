package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlunoTestCase {

	@Test
	void testGetSet() {
		Aluno a = new Aluno("3");
		
		a.setNome("5");
		
		assertEquals("5", a.getNome());
	}

}
