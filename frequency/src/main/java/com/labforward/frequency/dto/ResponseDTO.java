package com.labforward.frequency.dto;

import java.util.HashSet;
import java.util.Set;

public class ResponseDTO {
	private int frenquecy = 0;
	Set<String> listOfSimilar = new HashSet<String>();

	public ResponseDTO(int frenquecy, Set<String> listOfSimilar) {
		super();
		this.frenquecy = frenquecy;
		this.listOfSimilar = listOfSimilar;
	}

	public int getFrenquecy() {
		return frenquecy;
	}

	public void setFrenquecy(int frenquecy) {
		this.frenquecy = frenquecy;
	}

	public Set<String> getListOfSimilar() {
		return listOfSimilar;
	}

	public void setListOfSimilar(Set<String> listOfSimilar) {
		this.listOfSimilar = listOfSimilar;
	}

	@Override
	public String toString() {
		return "ResponseDTO [frenquecy=" + frenquecy + ", listOfSimilar=" + listOfSimilar + "]";
	}

}
