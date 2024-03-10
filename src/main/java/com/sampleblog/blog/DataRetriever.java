// package com.sampleblog.blog;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// @Component
// public class DataRetriever {

//     @Autowired
//     private BlogRepository blogRepository;

//     public void printAllBlogs() {
//         Iterable<BlogBean> allBlogs = blogRepository.findAll();
//         System.out.println("All Blogs:");
//         for (BlogBean blog : allBlogs) {
//             System.out.println("Author: " + blog.getAuthname());
//             System.out.println("Title: " + blog.getBlogname());
//             System.out.println("Content: " + blog.getBlogdes());
//             System.out.println("Created Date: " + blog.getCreateddt());
//             System.out.println();
//         }
//     }

//     // Other methods to retrieve and print data as needed
// }
