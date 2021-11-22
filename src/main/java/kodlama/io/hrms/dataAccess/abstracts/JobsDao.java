package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsDao extends JpaRepository <Jobs,Integer> {
}
