package com.knoldus.projectservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Studio {
    @Id
    @Column(name = "studio_id")
    private Long studio_id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_studio_id", referencedColumnName = "studio_id")
    private Set<Project> project;
}
