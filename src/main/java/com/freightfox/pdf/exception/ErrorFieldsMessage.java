package com.freightfox.pdf.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
public class ErrorFieldsMessage {
    private int statusCode;
    private Date timestamp;
    private String message;
    private Map<String, String> description;
}