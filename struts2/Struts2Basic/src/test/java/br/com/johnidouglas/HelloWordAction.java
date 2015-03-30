package br.com.johnidouglas;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWordAction extends ActionSupport   {

	private static final long serialVersionUID = 1L;
	
	private Message message;

	public String execute() throws Exception {
        
		message = new Message() ;
		
        return SUCCESS;
    }
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
}
