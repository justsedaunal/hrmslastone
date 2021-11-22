package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kodlama.io.hrms.core.utils.results.DataResult;
import kodlama.io.hrms.core.utils.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.User;


public interface CandidateService {

	
    DataResult<List<Candidate>> getAll();//tüm listeyi getirir
    
    Result add(Candidate candidate);//yeni aday ekler

    Result register (Candidate candidate);

    ResponseEntity<?> update(Candidate candidate);

    DataResult<User> findByEmail(String email);
}
