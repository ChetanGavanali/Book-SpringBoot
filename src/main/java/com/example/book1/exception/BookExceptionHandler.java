package com.example.book1.exception;

import com.example.book1.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
@Slf4j
public class BookExceptionHandler {

    @ExceptionHandler(BookException.class)
    public ResponseEntity<ResponseDTO> handleAddressBookException(BookException exception) {
        ResponseDTO resDTO = new ResponseDTO("Exception while processing REST request", exception.getMessage());
        return new ResponseEntity(resDTO, HttpStatus.BAD_REQUEST);
    }

}
