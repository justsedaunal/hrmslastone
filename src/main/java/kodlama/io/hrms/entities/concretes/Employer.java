package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table (name = "employers")

@RequiredArgsConstructor

public class Employer extends User {

    @NotBlank(message = "Company name alani bos birakilamaz!")
    @Column(name = "company_name", nullable = false)
    private String companyName ;

    @NotBlank(message = "Websitesi alani bos birakilamaz!")
    @Column(name = "website", nullable = false)
    private String webSite ;

    @NotBlank(message = "Telefon numarası alani bos birakilamaz!")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber ;



}
