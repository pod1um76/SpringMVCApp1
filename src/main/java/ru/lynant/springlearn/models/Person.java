package ru.lynant.springlearn.models;

import jakarta.validation.constraints.*;

public class Person {
    @NotEmpty(message = "Name should not be empty!")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    private int id;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @Min(value = 0, message = "Age should be > 0")
    @Max(value = 122, message = "Age should be < 122")
    private int age;

    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
