package com.example.mydiarycontacts.rest;

import java.util.List;

public class Resposta {
	
	private String code; 
     
	private String lang; 
	  
	private List<String> text;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

}
