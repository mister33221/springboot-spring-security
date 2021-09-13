package net.javaGuide.springboot.springbootHelloWorldapplication.bean;

//create an AuthenticationBean, which is used to return a success message to the client:
public class AuthenticationBean {

	
	public String message;
	
	public AuthenticationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		//%s是甚麼意思??
		return String.format("HelloWorldBean [message=%s]", message);
	}
	
	
}
