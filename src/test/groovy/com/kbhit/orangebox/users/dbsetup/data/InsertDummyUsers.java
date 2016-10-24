package com.kbhit.orangebox.users.dbsetup.data;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

import static com.kbhit.orangebox.users.dbsetup.DbSetupUtils.DISABLE_FOREIGN_KEY_CHECKS;
import static com.kbhit.orangebox.users.dbsetup.DbSetupUtils.ENABLE_FOREIGN_KEY_CHECKS;
import static com.kbhit.orangebox.users.dbsetup.builders.UserDetailsDummyBuilder.aDummyUserDetails;
import static com.kbhit.orangebox.users.dbsetup.builders.UsersDummyBuilder.aDummyUser;

public class InsertDummyUsers {

    private static final Operation AGATHA_USER = aDummyUser()
            .withId("agatha")
            .withUsername("agatha")
            .withPassword("agatha123")
            .withActivated(true)
            .build();

    private static final Operation AGATHA_USER_DETAILS = aDummyUserDetails()
            .withId("agatha")
            .withFirstName("Agata")
            .withLastName("Nowakiewicz")
            .build();

    private static final Operation GREG_USER = aDummyUser()
            .withId("greg")
            .withUsername("greg")
            .withPassword("greg123")
            .withActivated(true)
            .build();

    private static final Operation GREG_USER_DETAILS = aDummyUserDetails()
            .withId("greg")
            .withFirstName("Grzegorz")
            .withLastName("Gurgul")
            .build();

    public static Operation insertAll() {
        return Operations.sequenceOf(
                DISABLE_FOREIGN_KEY_CHECKS,
                AGATHA_USER,
                AGATHA_USER_DETAILS,
                GREG_USER,
                GREG_USER_DETAILS,
                ENABLE_FOREIGN_KEY_CHECKS
        );
    }

}
