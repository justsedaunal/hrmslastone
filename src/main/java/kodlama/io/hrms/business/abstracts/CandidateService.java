package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.core.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.User;


public interface CandidateService {

	
    DataResult<List<Candidate>> getAll();
    
    Result add(Candidate candidate);

    ResponseEntity<?> update(Candidate candidate);

    DataResult<User> findByEmail(String email);
}
