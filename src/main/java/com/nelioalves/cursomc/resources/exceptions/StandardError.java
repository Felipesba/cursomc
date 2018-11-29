package com.nelioalves.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer status;
	private String mg;
	private Long timeStamp;
	
	
	public StandardError(Integer status, String mg, Long timestamp) {
		super();
		this.status = status;
		this.mg = mg;
		this.timeStamp = timestamp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMg() {
		return mg;
	}


	public void setMg(String mg) {
		this.mg = mg;
	}


	public Long getTimestamp() {
		return timeStamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timeStamp = timestamp;
	}
	
	
	

	
	
}

