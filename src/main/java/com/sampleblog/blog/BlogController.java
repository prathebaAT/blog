package com.sampleblog.blog;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class BlogController {

    @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
    
}
