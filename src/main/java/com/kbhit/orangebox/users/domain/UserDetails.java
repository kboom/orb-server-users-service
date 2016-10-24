package com.kbhit.orangebox.users.domain;

import javax.persistence.*;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @EmbeddedId
    private UserId userId;

    @MapsId
    @OneToOne(mappedBy = "userDetails")
    @JoinColumn(name = "user_id")
    private User user;

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
