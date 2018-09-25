package com.chainbox.io.mock.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Bad you are missing some information.")
public class missingRecords extends RuntimeException {
}
