package br.com.personalproject.siseventos.exception.errorresponse;

import java.time.LocalDateTime;

import br.com.personalproject.siseventos.exception.base.BaseException;

public class ErrorResponse {

    private String message;
    private int status;
    private String path;
    private LocalDateTime timestamp;

    public ErrorResponse(BaseException baseException, int status, String path) {
        this.message = baseException.getMessage();
        this.status = baseException.getStatus().value();
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() { return message; }
    public int getStatus() { return status; }
    public String getPath() { return path; }
    public LocalDateTime getTimestamp() { return timestamp; }
}