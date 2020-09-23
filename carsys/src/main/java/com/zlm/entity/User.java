package com.zlm.entity;

public class User {
    private int id;
    private String tel;
    private String password;
    private String email;
    private String invitation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", passsword='" + password + '\'' +
                ", email='" + email + '\'' +
                ", invitation='" + invitation + '\'' +
                '}';
    }
}
