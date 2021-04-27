package com.labforward.frequency.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.labforward.frequency.dto.NoteBookWordsDTO;

public class FileUtils {

	public static NoteBookWordsDTO readFromNoteBook(String path) {
		try {
			NoteBookWordsDTO res = new NoteBookWordsDTO();
			String delimiters = "\\s+|,\\s*|\\.\\s*";
			List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			lines.stream().forEach(s -> res.addListOfWord(Arrays.asList(s.split(delimiters))));
			return res;
		} catch (IOException e) {
			return null;
		}

	}

}
