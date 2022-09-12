package com.wappi.qa.models;

public class CredentialsData {
    private String user;
    private String password;

    public CredentialsData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
}
