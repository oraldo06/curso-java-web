package br.com.tt.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertTest {

	@Test
	public void testCpf() {
		String cpf = new Convert().cpf("00831230088");
		assertEquals("008.312.300-88", cpf);
	}

}
