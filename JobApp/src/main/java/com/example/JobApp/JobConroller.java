package com.example.JobApp;


import com.example.JobApp.JobService.JobService;
import com.example.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobConroller {

    @Autowired
    private JobService service;


    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){ //accepting data from the browser
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewData(Model m){
        List<JobPost> jobs=service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
 // here above "jobPosts" must match to the  <c:forEach var="jobPost" items="${jobPosts}">
        return "viewalljobs";
    }














}
