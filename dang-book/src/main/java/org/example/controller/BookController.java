package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
  @Value("${server.port}")
  String port;

  @GetMapping("/book/test")
  public String t1(){
    System.out.println("test ok!!!");
    return "当前端口"+port;
  }
}
