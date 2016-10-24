package com.kbhit.orangebox.users.dbsetup.tables;

import java.util.Arrays;

public enum UserDetailsTable {

    USER_ID("USER_ID"),
    FIRST_NAME("FIRST_NAME"),
    LAST_NAME("LAST_NAME");
    String columnName;


    UserDetailsTable(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public static String[] allColumns() {
        return Arrays.stream(values()).map(UserDetailsTable::getColumnName).toArray(String[]::new);
    }

}
