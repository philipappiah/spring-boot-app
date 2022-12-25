package com.appdeveloperblog.app.ws.exception;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 1348771109171435607L;
    public int statusCode;
    
    public UserServiceException(String message, int statusCode){
        super(message);
        this.statusCode = statusCode;
    }
}
