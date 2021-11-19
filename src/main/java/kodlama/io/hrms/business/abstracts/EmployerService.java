package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    void add(Employer employer);
    Employer getPhoneNumberByCompanyId(int id);
    DataResult<Employer> getByCompanyNameAndPhoneNumbers_PhoneNumber(String companyName, String phoneNumber);
}
