package kodlama.io.hrms.controllers;


import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utils.results.DataResult;
import kodlama.io.hrms.core.utils.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){

        return this.employerService.add(employer);
     }


}
