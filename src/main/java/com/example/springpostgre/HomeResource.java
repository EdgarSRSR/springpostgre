package com.example.springpostgre;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//package com.example.springmysql;

// Here we manage the controllers
public class HomeResource {


  @GetMapping("/")
  public String home(){
    return("<h1>Welcome</h1>");
  }

  // to launch the user view
  @GetMapping("/user")
  public String user(){
    return("<h1>Welcome User</h1>");
  }

  //to launch the admin view
  @GetMapping("/admin")
  public String admin(){
    return("<h1>Welcome Admin</h1>");
  }



}
