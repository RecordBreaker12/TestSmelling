package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

import org.junit.jupiter.api.Test;

class ControleTestCase {
	
	Controle c = new Controle();
	
	@Test
	public void testEmprestar() throws ParseException {
		int[] codigos= {1,2,3,2};
		String aluno = "2";
		int num = 4;
		assertTrue(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	public void testEmprestGrande() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "2";
		int num = 4;
		assertTrue(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	public void alunoDebito() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "4";
		int num = 4;
		assertFalse(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void alunoBlank() throws ParseException {
		int[] codigos= {2,4,2,4};
		String aluno = "";
		int num = 4;
		assertFalse(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	public void noBook() throws ParseException {
		int[] codigos= {3};
		String aluno = "2";
		int num = 1;
		assertFalse(c.emprestar(aluno, codigos, num));
	}
}
