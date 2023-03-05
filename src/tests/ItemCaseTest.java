package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ItemCaseTest {

	Item i = new Item(new Livro(2));
	
	@Test
	void testGetSetData() {
		Date data = new Date();
		
		i.setDataDevolucao(data);
		
		assertEquals(data, i.getDataDevolucao());
	}
	
	@Test
	void testGetSetLivro() {
		Livro l = new Livro(5);
		
		i.setLivro(l);
		
		assertEquals(l, i.getLivro());
	}

}
