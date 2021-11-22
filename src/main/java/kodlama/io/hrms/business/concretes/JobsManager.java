package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobsService;
import kodlama.io.hrms.dataAccess.abstracts.JobsDao;
import kodlama.io.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobsManager implements JobsService {

    @Autowired
    public JobsDao jobsDao;


    @Override
    public List<Jobs> getAll() {

        return this.jobsDao.findAll();
    }

    @Override
    public void add(Jobs jobs) {
         this.jobsDao.save(jobs);
    }
}
