package com.example.JobApp.JobService;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){// these objects are "DTO" data transfer objects
          repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
          return repo.getAllJobs();
    }
}
