package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "classes")
@Data
@Entity
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
}