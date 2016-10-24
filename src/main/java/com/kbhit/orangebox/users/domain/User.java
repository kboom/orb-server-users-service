package com.kbhit.orangebox.users.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @EmbeddedId
    private UserId userId;

    private String username;

    private String password;

    private boolean activated;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserDetails userDetails;

    @OneToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "username", referencedColumnName = "username"),
            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "authority_id")
    )
    private List<Authority> authorities;

    public UserId getUserId() {
        return userId;
    }

    public boolean isActivated() {
        return activated;
    }

    public boolean getActivated() {
        return activated;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
