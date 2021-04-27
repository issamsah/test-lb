package com.labforward.frequency.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labforward.frequency.dto.ResponseDTO;
import com.labforward.frequency.service.NoteBookService;

@RestController
@RequestMapping
public class NoteBookWebService {

	@Autowired
	NoteBookService noteBookservice;

	/**
	 * web service to get the Frenquency And Words Similar
	 * 
	 * @param word
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/frequency")
	public ResponseDTO getFrenquencyAndWordSimilar(@RequestParam(value = "word") String word,
			@RequestParam(value = "fileName") String fileName) throws Exception {
		return noteBookservice.getFrenquencyAndWordSimilar(word, fileName);

	}

}
