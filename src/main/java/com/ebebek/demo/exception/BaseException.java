package com.ebebek.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public abstract class BaseException extends RuntimeException{
	
	private static final long serialVersionUID = 5219696788890779392L;
	
	private String reasonMessage;
}
