package com.kbhit.orangebox.users.dbsetup.builders;

import com.ninja_squad.dbsetup.operation.Operation;

import java.util.TreeMap;

import static com.kbhit.orangebox.users.dbsetup.tables.UsersTable.*;
import static com.ninja_squad.dbsetup.Operations.insertInto;

public class UsersDummyBuilder {

    private TreeMap<String, Object> orderedValuesMap = new TreeMap<>();

    public UsersDummyBuilder withId(String login) {
        orderedValuesMap.put(USER_ID.getColumnName(), login);
        return this;
    }

    public UsersDummyBuilder withUsername(String login) {
        orderedValuesMap.put(USERNAME.getColumnName(), login);
        return this;
    }

    public UsersDummyBuilder withPassword(String password) {
        orderedValuesMap.put(PASSWORD.getColumnName(), password);
        return this;
    }

    public UsersDummyBuilder withActivated(boolean activated) {
        orderedValuesMap.put(ACTIVATED.getColumnName(), activated);
        return this;
    }

    public Operation build() {
        return insertInto("USERS")
                .columns(orderedValuesMap.keySet().stream().toArray(String[]::new))
                .values(orderedValuesMap.values().stream().toArray(Object[]::new)).build();
    }

    public static UsersDummyBuilder aDummyUser() {
        return new UsersDummyBuilder();
    }
}
