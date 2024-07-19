package com.wecp.progressive.exception;

<<<<<<< HEAD
public class CustomerAlreadyExistsException {
=======
public class CustomerAlreadyExistsException extends RuntimeException{
    public CustomerAlreadyExistsException(String msg){
        super(msg);
    }
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}