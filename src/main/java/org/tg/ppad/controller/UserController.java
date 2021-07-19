package org.tg.ppad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tg.ppad.exception.ResourceNotFoundException;
import org.tg.ppad.model.User;
import org.tg.ppad.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllEmployees() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity < User > getUserById(@PathVariable(value = "id") Long userId)
    throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
        log.info("Db Obj - {}:",user);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        log.info("Input Request - {} ", user);
        return userRepository.save(user);
    }

}