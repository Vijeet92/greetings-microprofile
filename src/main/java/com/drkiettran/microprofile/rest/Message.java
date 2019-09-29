package com.drkiettran.microprofile.rest;


import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Message exchange class.
 * 
 * @author ktran
 *
 */
public class Message implements Serializable {
	private static final long serialVersionUID = 2120914098830910225L;
	private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

	@JsonProperty("id")
	private int id;

	@JsonProperty("first-name")
	private String firstName;

	@JsonProperty("last-name")
	private String lastName;

	@JsonProperty("message")
	private String message;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.name = firstName;
	}

	publicString getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.name = lastName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: {}", e);
		}
		return "Marhsaling error";
	}
}
