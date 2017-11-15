package com.kodilla.testing.user;

public class SimpleUser {
    String realname;
    String username;

    public SimpleUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }
    public String getRealname() {
        return realname;
    }
}
