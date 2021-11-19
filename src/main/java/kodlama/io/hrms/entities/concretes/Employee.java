package kodlama.io.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "employees")
@NoArgsConstructor
@AllArgsConstructor

public class Employee extends Individual{

}
