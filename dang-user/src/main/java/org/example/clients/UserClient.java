package org.example.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "dangbook")
public interface UserClient {
  @GetMapping("/test")
  public String t1();
}
