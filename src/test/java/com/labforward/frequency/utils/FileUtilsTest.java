package com.labforward.frequency.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.labforward.frequency.dto.NoteBookWordsDTO;

class FileUtilsTest {

	private File fileTests;

	@BeforeEach
	public void setUp() {
		// path for test resources
		String literalPathTestResources = "src/test/resources";
		fileTests = new File(literalPathTestResources);
	}

	@Test
	public void checkNotExistFileCase() {
		String pathTestResources = fileTests.getAbsolutePath().concat("/notebook/4.txt");
		NoteBookWordsDTO res = FileUtils.readFromNoteBook(pathTestResources);
		assertNull(res);
	}

	@Test
	public void checkExistFileCase() {
		String pathTestResources = fileTests.getAbsolutePath().concat("/notebook/1.txt");
		NoteBookWordsDTO res = FileUtils.readFromNoteBook(pathTestResources);
		assertNotNull(res);
		assertEquals(8, res.getListOfWord().size());
	}

}
