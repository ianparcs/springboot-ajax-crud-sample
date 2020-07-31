package com.bancnet.exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data


@ToString
public class ServiceResponse<T> {
	
	private String status;
	private T data;
	public ServiceResponse(String status, T data) {
		super();
		this.status = status;
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public String getStatus() {
		return status;
	}

}