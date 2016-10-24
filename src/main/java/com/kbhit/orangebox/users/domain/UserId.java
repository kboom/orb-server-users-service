package com.kbhit.orangebox.users.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserId implements Serializable {

    private String id;

    private UserId(String userId) {
        this.id = userId;
    }

    public static UserId userId(String id) {
        return new UserId(id);
    }

    @SuppressWarnings("unused")
    UserId() {

    }

}
