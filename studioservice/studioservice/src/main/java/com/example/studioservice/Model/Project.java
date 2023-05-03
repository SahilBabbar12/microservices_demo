package com.example.studioservice.Model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Transactional
public class Project {
    private int project_id;

    private String projectName;
    private String project_email;

    //This one to one column will create the foreign key column in the Employee class and the default name of it will be
    //reference entity class_primary-key column name
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name= "fk_house_no")
    @Embedded
    public TeamMembers teamMembers;

}
