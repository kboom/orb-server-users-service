package com.kbhit.orangebox.users.dbsetup.builders;

import com.ninja_squad.dbsetup.operation.Operation;

import java.util.TreeMap;

import static com.kbhit.orangebox.users.dbsetup.tables.UserDetailsTable.FIRST_NAME;
import static com.kbhit.orangebox.users.dbsetup.tables.UserDetailsTable.LAST_NAME;
import static com.kbhit.orangebox.users.dbsetup.tables.UserDetailsTable.USER_ID;
import static com.ninja_squad.dbsetup.Operations.insertInto;

public class UserDetailsDummyBuilder {

    private TreeMap<String, Object> orderedValuesMap = new TreeMap<>();

    public UserDetailsDummyBuilder withId(String login) {
        orderedValuesMap.put(USER_ID.getColumnName(), login);
        return this;
    }

    public UserDetailsDummyBuilder withFirstName(String firstName) {
        orderedValuesMap.put(FIRST_NAME.getColumnName(), firstName);
        return this;
    }

    public UserDetailsDummyBuilder withLastName(String lastName) {
        orderedValuesMap.put(LAST_NAME.getColumnName(), lastName);
        return this;
    }

    public Operation build() {
        return insertInto("USER_DETAILS")
                .columns(orderedValuesMap.keySet().stream().toArray(String[]::new))
                .values(orderedValuesMap.values().stream().toArray(Object[]::new)).build();
    }

    public static UserDetailsDummyBuilder aDummyUserDetails() {
        return new UserDetailsDummyBuilder();
    }

}
