package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IndividualDao extends JpaRepository <Individual, Integer> {
}
