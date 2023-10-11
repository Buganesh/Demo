package com.oasys.studentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeIsLessThanEighteenException.class)
	public ResponseEntity<Object> AgeHandle(AgeIsLessThanEighteenException add){
		return new ResponseEntity<>(add.getMessage(),HttpStatus.NOT_FOUND);
	}

}
