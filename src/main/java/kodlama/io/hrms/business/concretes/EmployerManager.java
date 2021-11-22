package kodlama.io.hrms.business.concretes;

import java.util.List;

import kodlama.io.hrms.core.utils.results.Result;
import kodlama.io.hrms.core.utils.results.SuccessDataResult;
import kodlama.io.hrms.core.utils.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utils.results.DataResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.crypto.Data;

@Service
public class EmployerManager implements EmployerService{
	
	@Autowired
	private EmployerDao employerDao ;

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<>(this.employerDao.findAll()) ;
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("basarılı");
	}

	@Override
	public Employer getPhoneNumberByCompanyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
