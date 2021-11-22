package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Jobs;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface JobsService {
List<Jobs>getAll();
void add (Jobs jobs);
}
