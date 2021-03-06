package br.com.manager.places.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringSimilarityTest {

	@Test
	public void mustReturnIsSimilarTrue() {
		boolean result = StringSimilarity.isSimilar("Padaria St Antônio", "Padaria Santo Antônio");
		assertEquals(true, result);
	}
	
	@Test
	public void mustReturnIsSimilarFalse() {
		boolean result = StringSimilarity.isSimilar("Padaria St Antônio", "Padaria Santo Carlos");
		assertEquals(false, result);
	}
	
}