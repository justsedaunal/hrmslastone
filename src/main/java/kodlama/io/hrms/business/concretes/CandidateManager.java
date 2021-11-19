package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.core.results.Result;
import kodlama.io.hrms.core.results.SuccessDataResult;
import kodlama.io.hrms.core.results.SuccessResult;
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
		return new SuccessResult();
	}

	@Override
	public ResponseEntity<?> update(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
