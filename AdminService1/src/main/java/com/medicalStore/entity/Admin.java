package com.medicalStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Username must be between 4 and 20 characters, consisting of letters only
    @Pattern(regexp = "[a-zA-Z]{3,20}$", message = "Username must be between 4 and 20 characters")
    private String userName;

    // Password must be at least 6 characters, starting with a capital letter and containing at least one symbol
    @Pattern(regexp = "^[A-Z]+[a-zA-Z0-9@#$%^&*!]{6,20}$", message = "Password must be at least 6 characters & Atleast One Capital Letter and one Symbol")
    private String password;

    // Default constructor
    public Admin() {
        super();
    }

    // Parameterized constructor
    public Admin(Long id, String userName, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + "]";
    }
}
