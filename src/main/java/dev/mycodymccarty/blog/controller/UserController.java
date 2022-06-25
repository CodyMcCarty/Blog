package dev.mycodymccarty.blog.controller;

import dev.mycodymccarty.blog.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/users")
@Slf4j
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        log.debug("REST request to get customers");
        List<User> users = List.of(
                new User(1L, "Cody", true)
        ); //userService.findAll();
        return ResponseEntity.ok().body(users);
    }
}
