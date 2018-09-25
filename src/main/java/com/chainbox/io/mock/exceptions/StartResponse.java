package com.chainbox.io.mock.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.resource.HttpResource;

@ResponseStatus(code = HttpStatus.ACCEPTED,reason = "start initiated successful")
public class StartResponse extends RuntimeException{
}
