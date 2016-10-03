package com.kbhit.orangebox.trading.dbsetup.data;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

import static com.kbhit.orangebox.trading.dbsetup.builders.UsersDummyBuilder.aDummyUser;

public class InsertDummyUsers {

    private static final Operation AGATA_BIDDER = aDummyUser()
            .withFirstName("Agata")
            .withLastName("Gurgul")
            .withLogin("agatha")
            .build();

    private static final Operation GRZEGORZ_BIDDER = aDummyUser()
            .withFirstName("Grzegorz")
            .withLastName("Gurgul")
            .withLogin("greg")
            .build();

    public static Operation insertAll() {
        return Operations.sequenceOf(AGATA_BIDDER, GRZEGORZ_BIDDER);
    }

}
