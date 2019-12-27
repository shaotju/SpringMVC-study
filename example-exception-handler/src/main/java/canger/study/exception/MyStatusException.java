package canger.study.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyStatusException extends RuntimeException {
    public MyStatusException(String message) {
        super(message);
    }
}
