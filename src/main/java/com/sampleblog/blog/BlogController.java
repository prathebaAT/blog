package com.sampleblog.blog;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;





@RestController
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   @PostMapping("/submit-blog")
    public String submitBlog(@ModelAttribute BlogBean blog, RedirectAttributes redirectAttributes) {
        // Save the submitted blog data to the database
        blogRepository.save(blog);
        // Add flash attribute to indicate successful saving
        redirectAttributes.addFlashAttribute("message", "Blog saved successfully");
        return "redirect:/index";
    }
    @RequestMapping("/view-blogs")
    public String viewBlogs(Model model) {
        // Fetch and display all blogs
        model.addAttribute("blogs", blogRepository.findAll());
        return "view-blogs";
    }
    
}
