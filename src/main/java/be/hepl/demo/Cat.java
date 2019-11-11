package be.hepl.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String color;
    private String name;
    private String eyeColor;
    private String lastName;

}
