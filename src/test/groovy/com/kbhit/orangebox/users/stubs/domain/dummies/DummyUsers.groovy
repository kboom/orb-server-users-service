package com.kbhit.orangebox.users.stubs.domain.dummies

import com.kbhit.orangebox.users.stubs.domain.UserBuilder
import org.springframework.stereotype.Component

import static com.kbhit.orangebox.users.stubs.domain.UserBuilder.aUser

@Component
class DummyUsers {

    static UserBuilder agathaUser() {
        aUser()
                .withActivated(true)
                .withAuthorities("user")
                .withUsername("agatha")
                .withPassword("secret");
    }

    static UserBuilder gregUser() {
        aUser()
                .withActivated(true)
                .withAuthorities("user")
                .withUsername("greg")
                .withPassword("secret");
    }

    static UserBuilder otherUser() {
        aUser()
                .withActivated(true)
                .withAuthorities("user")
                .withUsername("other")
                .withPassword("secret");
    }

}
