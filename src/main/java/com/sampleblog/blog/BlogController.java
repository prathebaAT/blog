package com.sampleblog.blog;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.mvc.support.RedirectAttributes;





@Controller
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/")
   public String index() {
      return "index";
   }
   @PostMapping("/submit-blog")
    public String submitBlog(@ModelAttribute BlogBean blog, RedirectAttributes redirectAttributes) {
        // Save the submitted blog data to the database
        blogRepository.save(blog);
        // Add flash attribute to indicate successful saving
        redirectAttributes.addFlashAttribute("message", "Blog saved successfully");
        return "index";
    }
    @GetMapping("/view-blogs")
    public String viewBlogs(Model model) {
        // Fetch and display all blogs
        model.addAttribute("blogs", blogRepository.findAll());
        return "view-blogs";
    }
    
}
