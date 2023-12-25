package com.mshop.authservice.exception

import com.mshop.exception.ApiException
import org.springframework.http.HttpStatus

class TokenExpired(message: String? = null) : ApiException(HttpStatus.BAD_REQUEST, message ?: "Token is expired")