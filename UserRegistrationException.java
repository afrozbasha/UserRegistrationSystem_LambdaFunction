package com.UserRegistrationLambdaFunction;

public class UserRegistrationException extends Exception{
    enum ExceptionType{
        nullType, emptyType
    }
    ExceptionType type;
    public UserRegistrationException(String message, ExceptionType type){
        super(message);
        this.type = type;
    }

}
