package ir.ansarit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("ir.ansarit")
public class AuthenticationGlobalHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity handle(){
        return new ResponseEntity("Authentication failed:? please try a gain", HttpStatus.BAD_REQUEST);
    }
}
