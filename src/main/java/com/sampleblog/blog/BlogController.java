package com.sampleblog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


@RestController
public class BlogController {

    // @GetMapping("/")
    // public String index() {
    //     return "index";
    // }
    // @GetMapping("/greeting")
	// public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
	// 	return "greetin";
    // }

    @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
    
}
