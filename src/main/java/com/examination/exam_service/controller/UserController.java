package com.examination.exam_service.controller;
import com.examination.exam_service.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
        @PostMapping
        public User addUser(User user){
                return user;
        }

        @GetMapping
        public List<User> getAllUSer(){
                return null;
        }

        @GetMapping("/{id}")
        public User getUSerById(@PathVariable(value = "id")int id){
                return null;
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable(value = "id")int id){

        }

}
