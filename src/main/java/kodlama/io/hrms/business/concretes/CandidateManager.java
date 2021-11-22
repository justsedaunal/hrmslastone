package kodlama.io.hrms.business.concretes;

import java.util.List;

import kodlama.io.hrms.core.utils.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.User;
@Service
public class CandidateManager implements CandidateService {

	@Autowired
	private CandidateDao candidateDao;



	@Override
	public DataResult<List<Candidate>> getAll() {

		return new SuccessDataResult<>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("bisey");
	}


	@Override
	public Result register(Candidate candidate) {
		if (candidate.getFirstName().isEmpty() ||
				candidate.getLastName().isEmpty() ||
				candidate.getEmail().isEmpty() ||
				candidate.getIdentificationNumber().isEmpty() ) {

		return new ErrorResult("This area can't be empty.");

	}
	else

	{

		return new SuccessResult("Your registration has been created successfully");

	}
	}

	@Override
	public ResponseEntity<?> update(Candidate candidate) {
		return null;
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return null;
	}
}







