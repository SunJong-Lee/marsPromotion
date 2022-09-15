package com.mars.marspromotion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "apply")
@Getter
public class Apply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "type")
    private int type;

    @Column(name = "objective")
    private String objective;

    @Builder
    public Apply(Long id, String name, String phoneNumber, int type, String objective) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.objective = objective;
    }

    public static Apply create(String name, String phoneNumber, int type, String objective) {
        return new Apply(name, phoneNumber, type, objective);
    }

    private Apply(String name, String phoneNumber, int type, String objective) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.objective = objective;
    }
}
