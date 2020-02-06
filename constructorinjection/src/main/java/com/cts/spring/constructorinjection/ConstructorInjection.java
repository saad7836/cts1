package com.cts.spring.constructorinjection;

public class ConstructorInjection {
	private String message = null;

	  public ConstructorInjection(String message) {
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

}
