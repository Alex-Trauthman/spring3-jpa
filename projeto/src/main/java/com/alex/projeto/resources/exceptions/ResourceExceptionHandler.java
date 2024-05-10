package com.alex.projeto.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alex.projeto.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> notFound(ResourceNotFoundException not, HttpServletRequest servlet){
		String error = "resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError standard = new StandardError(Instant.now(),status.value(),error,not.getMessage(),servlet.getRequestURI());
		return ResponseEntity.status(status).body(standard);
	}
}
