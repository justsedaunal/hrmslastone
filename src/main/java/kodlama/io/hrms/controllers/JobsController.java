package kodlama.io.hrms.controllers;


import kodlama.io.hrms.business.abstracts.JobsService;
import kodlama.io.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/jobs")

public class JobsController {

    @Autowired
    private JobsService jobsService;

    @GetMapping("/getAll")
    public List<Jobs> getAll()
    {

        return this.jobsService.getAll();
    }


    @PostMapping("/add")
    public void add (@RequestBody Jobs jobs){

        this.jobsService.add(jobs);
    }



}
