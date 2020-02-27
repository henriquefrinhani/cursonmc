package com.nelioalves.cursomc.services.exceptions;

public class ObjectNotFoundExceptions extends RuntimeException{
	
	public ObjectNotFoundExceptions (String msg) {
		super(msg);
	}

	public ObjectNotFoundExceptions (String msg, Throwable cause) {
		super(msg, cause);
	}
}
