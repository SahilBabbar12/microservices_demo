package com.knoldus.projectservice.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private int project_id;
    @Column(name = "project_name")
    private String projectName;
    private String project_email;

    private Long studio_id;

}
