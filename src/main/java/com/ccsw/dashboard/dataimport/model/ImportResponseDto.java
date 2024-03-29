package com.ccsw.dashboard.dataimport.model;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MultipartFile;

public class ImportResponseDto {

	private LocalDateTime timestamp;
	private HttpStatus status;
	private String message;
	private String error;
	private String trace;
	private String path;

	public ImportResponseDto(){
		this.timestamp= LocalDateTime.now();
		this.status = HttpStatus.ACCEPTED;
		this.message="";
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
