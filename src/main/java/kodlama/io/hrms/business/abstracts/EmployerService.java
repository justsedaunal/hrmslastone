package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utils.results.DataResult;
import kodlama.io.hrms.core.utils.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
    Employer getPhoneNumberByCompanyId(int id);
}
