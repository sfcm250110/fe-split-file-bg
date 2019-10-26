package ec.com.kruger.util;

import java.io.Serializable;

public class LineProperty implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String value;
	private String newLine;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getNewLine() {
		return newLine;
	}

	public void setNewLine(String newLine) {
		this.newLine = newLine;
	}

	@Override
	public String toString() {
		return "LineProperty [value=" + value + ", newLine=" + newLine + "]";
	}

}