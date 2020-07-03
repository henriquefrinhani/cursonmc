package com.nelioalves.cursomc.resources.exception;

public class FieldMessager {
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String messager;
	
	public FieldMessager() {
	}

	public FieldMessager(String fieldName, String messager) {
		super();
		this.fieldName = fieldName;
		this.messager = messager;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessager() {
		return messager;
	}

	public void setMessager(String messager) {
		this.messager = messager;
	}

}
