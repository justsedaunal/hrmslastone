package kodlama.io.hrms.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.core.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.User;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/candidates")
public class CandidatesController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @PostMapping("/save")
    public Result add(@Valid @RequestBody Candidate candidate){
        return this.candidateService.add(candidate);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Candidate candidate){
        return this.candidateService.update(candidate);
    }

    @PostMapping("/findByEmail")
    public DataResult<User> findByEmail(@RequestParam String email){
        return this.candidateService.findByEmail(email);
    }
}