package com.labforward.frequency.service;

import com.labforward.frequency.dto.ResponseDTO;

public interface NoteBookService {

	/**
	 * get Frenquency And Word Similar
	 * 
	 * @param word
	 * @param fileName
	 * @return ResponseDTO
	 */
	public ResponseDTO getFrenquencyAndWordSimilar(String word,String fileName);
}
