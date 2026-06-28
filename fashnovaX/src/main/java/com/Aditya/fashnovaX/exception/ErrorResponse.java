package com.Aditya.fashnovaX.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private int statusCode;
    private String message;
    private LocalDate timestamp;

}
