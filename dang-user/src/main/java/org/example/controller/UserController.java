package org.example.controller;

import org.example.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @Autowired
  UserClient userClient;
  @GetMapping("/user/test")
  public String t1(){
    String s = userClient.t1();
    return s;
  }
}
