package com.kbhit.orangebox.users.domain;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORITIES")
public class Authority {

    @Id
    @SequenceGenerator(name = "authority_seq", initialValue = 10000, allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authority_seq")
    @Column(name = "authority_id")
    private Long id;

    private String name;

    public Authority(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    Authority() {

    }

}
