package com.example.demo.payload.response;

import com.example.demo.models.Role;

import java.util.List;
import java.util.Set;

public class JwtResponse {
    private String token;
    private String type;
    private String id;
    private String username;
    private String email;
    private List<String> roles;


    public JwtResponse(String jwt, String id, String username, String email, List<String> roles) {
        this.token=jwt;
        this.id=id;
        this.username=username;
        this.email=email;
        this.roles=roles;
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
