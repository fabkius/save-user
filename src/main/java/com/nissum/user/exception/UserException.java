package com.nissum.user.exception;

import com.nissum.user.domain.ErrorInfo;

public class UserException extends RuntimeException {

    private ErrorInfo errorInfo;

    public UserException(ErrorInfo errorInfo){
        super(errorInfo.getMessage());
        this.errorInfo=errorInfo;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }
}
