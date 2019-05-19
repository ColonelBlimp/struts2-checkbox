package com.struts2stuff.struts2.beans;

import java.util.Objects;

public final class ListElementBean {

	private final String text;

	public ListElementBean(String text) {
		this.text = Objects.requireNonNull(text);
	}

	public String getText() {
		return text;
	}
}
