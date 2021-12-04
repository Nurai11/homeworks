package com.company;

public class User {
    private String name;
    private String login;
    private int age;
    private String password;
    private boolean isBlocked;

    public User(String name, String login, int age, String password, boolean isBlocked) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
        this.isBlocked = isBlocked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }


    @Override
    public String toString(){
        return "User name: " + name + "\nLogin: " + login + "\nAge: " + age + "\nPassword: " + password +
                "\nThe account is blocked: " + isBlocked;
    }
}
