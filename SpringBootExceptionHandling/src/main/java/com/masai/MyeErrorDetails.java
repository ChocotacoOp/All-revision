package com.masai;

import java.time.LocalDateTime;

public class MyeErrorDetails {

	private LocalDateTime time;
	private String message;
	private String details;
	
	public MyeErrorDetails(){
		
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public MyeErrorDetails(LocalDateTime time, String message, String details) {
		super();
		this.time = time;
		this.message = message;
		this.details = details;
	}

	@Override
	public String toString() {
		return "MyeErrorDetails [time=" + time + ", message=" + message + ", details=" + details + "]";
	}
	
}
