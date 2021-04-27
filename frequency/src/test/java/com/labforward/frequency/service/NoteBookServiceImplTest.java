package com.labforward.frequency.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.labforward.frequency.dto.ResponseDTO;

class NoteBookServiceImplTest {
	private File fileTests;
	private NoteBookServiceImpl service;

	@BeforeEach
	public void setUp() {
		// path for test resources
		String literalPathTestResources = "src/test/resources/notebook";
		fileTests = new File(literalPathTestResources);
		service = new NoteBookServiceImpl();
		fileTests.getAbsolutePath();
		service.setPath(literalPathTestResources);
	}

	@Test
	public void checkgetFrenquencyAndWordSimilar() {

		ResponseDTO response = service.getFrenquencyAndWordSimilar("Word", "2.txt");
		assertNotNull(response);
		assertEquals(1, response.getFrenquecy());
		assertEquals(4, response.getListOfSimilar().size());
	}

}
