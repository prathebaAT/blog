package com.sampleblog.blog;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BlogBean {


    private String authName;
    private String blogname;
    private String blogdes;

     @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createddt;
    public Date getCreateddt() {
        return createddt;
    }

    public void setCreateddt(Date createddt) {
        this.createddt = createddt;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getBlogdes() {
        return blogdes;
    }

    public void setBlogdes(String blogdes) {
        this.blogdes = blogdes;
    }



    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
    

