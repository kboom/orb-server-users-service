package com.kbhit.orangebox.trading.dbsetup.builders;

import com.ninja_squad.dbsetup.operation.Operation;

import java.util.TreeMap;

import static com.kbhit.orangebox.trading.dbsetup.tables.UsersTable.*;
import static com.ninja_squad.dbsetup.Operations.insertInto;

public class UsersDummyBuilder {

    private TreeMap<String, Object> orderedValuesMap = new TreeMap<>();

    public UsersDummyBuilder withFirstName(String firstName) {
        orderedValuesMap.put(FIRST_NAME.getColumnName(), firstName);
        return this;
    }

    public UsersDummyBuilder withLastName(String lastName) {
        orderedValuesMap.put(LAST_NAME.getColumnName(), lastName);
        return this;
    }

    public UsersDummyBuilder withLogin(String login) {
        orderedValuesMap.put(LOGIN.getColumnName(), login);
        return this;
    }

    public Operation build() {
        return insertInto("USERS")
                .columns(orderedValuesMap.keySet().stream().toArray(String[]::new))
                .values(orderedValuesMap.values().stream().toArray(Object[]::new)).build();
    }

    public static UsersDummyBuilder aDummyBidder() {
        return new UsersDummyBuilder();
    }

}
