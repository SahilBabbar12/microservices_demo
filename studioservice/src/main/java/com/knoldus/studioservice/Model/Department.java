package com.knoldus.studioservice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Department")
public class Department {
    @SequenceGenerator(
            name="department_sequence",
            sequenceName ="department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"
    )

    @Id
    @Column(name="department_id")
    private Long departmentId;
    @Column(name="department_name")
    private String departmentName;

    @Transient
    List<Project> projectList;
}
