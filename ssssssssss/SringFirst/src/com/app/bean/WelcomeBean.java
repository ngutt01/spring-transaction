package com.app.bean;

public class WelcomeBean {
        private String message ;
        public void setMessage(String message) {
        	this.message=message;
        }
        public void showMessage() {
        	System.out.println("message:"+message);
        }
		
        
}
