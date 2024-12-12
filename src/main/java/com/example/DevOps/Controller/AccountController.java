package com.example.DevOps.Controller;


import com.example.DevOps.ModelClass.AppUser;
import com.example.DevOps.ModelClass.RegisterDto;
import com.example.DevOps.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @Autowired
    private AppUserRepository myAppUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/signup", consumes = "application/json")
    public AppUser createUser(@RequestBody AppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myAppUserRepository.save(user);
    }
}