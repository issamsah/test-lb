package com.labforward.frequency.service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.labforward.frequency.dto.NoteBookWordsDTO;
import com.labforward.frequency.dto.ResponseDTO;
import com.labforward.frequency.utils.FileUtils;

@Service
public class NoteBookServiceImpl implements NoteBookService {
	@Value("${path.notebooks}")
	private String path;

	/**
	 * @see NoteBookService#getFrenquencyAndWordSimilar(String, String)
	 */
	@Override
	public ResponseDTO getFrenquencyAndWordSimilar(String word, String fileName) {
		NoteBookWordsDTO res = FileUtils.readFromNoteBook(path + "/" + fileName);
		if (res != null) {

			List<String> listOfStringEquals = res.getListOfWord().stream().filter(s -> s.equals(word))
					.collect(Collectors.toList());
			List<String> listOfStringSimilaire = res.getListOfWord().stream()
					.filter(s -> LevenshteinDistance.getDefaultInstance().apply(word, s) <= 1).collect(Collectors.toList());
			return new ResponseDTO(listOfStringEquals.size(), new HashSet<String>(listOfStringSimilaire));

		}
		return null;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
