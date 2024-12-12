package com.example.DevOps.ModelClass;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;


public class RegisterDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastname;

    @NotEmpty
    @Email
    private String email;

    @Getter
    private String address;

    private String phone;

    @Size(min=6, message="Minimum password length is 6 characters")
    private String password;

    private String confirmPassword;

    public @NotEmpty String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty String getLastname() {
        return lastname;
    }

    public void setLastname(@NotEmpty String lastname) {
        this.lastname = lastname;
    }

    public @NotEmpty @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty @Email String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public @Size(min = 6, message = "Minimum password length is 6 characters") String getPassword() {
        return password;
    }

    public void setPassword(@Size(min = 6, message = "Minimum password length is 6 characters") String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
