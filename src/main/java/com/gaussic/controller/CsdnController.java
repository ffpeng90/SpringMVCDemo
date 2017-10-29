package com.gaussic.controller;

import com.gaussic.model.CsdnEntity;
import com.gaussic.repository.CsdnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by ffpeng on 2017/3/7.
 */
@Controller
public class CsdnController {

    @Autowired
    CsdnRepository csdnRepository;

    // 查看所有博文
    @RequestMapping(value = "/csdn/blogs", method = RequestMethod.GET)
    public String showBlogs(ModelMap modelMap) {
        List<CsdnEntity> blogList = csdnRepository.findAll();
        modelMap.addAttribute("blogList", blogList);
        return "csdn/blogs";
    }

    // 查看博文详情，默认使用GET方法时，method可以缺省
/*    @RequestMapping("/csdn/blogs/show/{id}")
    public String showBlog(@PathVariable("id") int id, ModelMap modelMap) {
        CsdnEntity blog = csdnRepository.findOne(id);
        modelMap.addAttribute("blog", blog);
        return "csdn/blogDetail";
    }*/

    @RequestMapping("/csdn/blogs/{csdnBlogId}")
    public String showBlog(@PathVariable("csdnBlogId") long csdnBlogId, ModelMap modelMap) {
        CsdnEntity blog = csdnRepository.findOne(csdnBlogId);
        modelMap.addAttribute("title", blog.getTitle());
        modelMap.addAttribute("author", blog.getAuthor());
        modelMap.addAttribute("url", blog.getUrl());
        return "blog";
    }
}
