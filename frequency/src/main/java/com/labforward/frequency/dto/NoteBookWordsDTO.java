package com.labforward.frequency.dto;

import java.util.ArrayList;
import java.util.List;

public class NoteBookWordsDTO {
	List<String> listOfWord;

	public NoteBookWordsDTO() {
		
		this.listOfWord = new ArrayList<String>();
	}

	public NoteBookWordsDTO(List<String> listOfWord) {
		super();
		this.listOfWord = listOfWord;
	}

	public List<String> getListOfWord() {
		return listOfWord;
	}

	public void setListOfWord(List<String> listOfWord) {
		this.listOfWord = listOfWord;
	}
	public void addListOfWord(List<String> listOfWord) {
		this.listOfWord.addAll(listOfWord);
	}
	public void addWord(String word) {
		this.listOfWord.add(word);
	}

	@Override
	public String toString() {
		return "NoteBook [listOfWord=" + listOfWord + "]";
	}
	

}
