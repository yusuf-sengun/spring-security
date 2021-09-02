package com.example.demo.payload.response;

public class MessageResponse {
    private String message;

    public MessageResponse(String s) {
        this.message=s;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
