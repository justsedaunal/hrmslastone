package kodlama.io.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor//gerekli olduğunda constructor üret demek.kullanıcı input olarak ne girerse ona göre constructor üreitor.

@Table(name = "jobs")

public class Jobs {

    @Id
    @Column(name = "id" , updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name" , nullable = false)
    private String name ;
}
