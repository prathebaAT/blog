package com.sampleblog.blog;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class BlogController {

    @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   @PostMapping("/submit-blog")
    public String submitBlog(@ModelAttribute BlogBean blog) {
        // Process the submitted blog object (e.g., save it to a database)
        return "redirect:/success"; // Redirect to a success page
    }
    
}
