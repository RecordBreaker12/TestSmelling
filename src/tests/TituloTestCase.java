package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TituloTestCase {

	Titulo t = new Titulo(2);
	
	@Test
	void testGetSet() {
		t.setPrazo(4);
		
		assertEquals(4, t.getPrazo());
	}

}
