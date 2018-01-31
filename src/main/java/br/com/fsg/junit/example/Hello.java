package br.com.fsg.junit.example;

import org.apache.commons.lang3.StringUtils;

public class Hello {

	private String text;

	public Hello(String text) {
		this.text = text;
	}

	public String getText() {
		return StringUtils.capitalize(text);
	}

}
