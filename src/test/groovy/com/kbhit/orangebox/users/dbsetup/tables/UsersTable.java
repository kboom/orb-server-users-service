package com.kbhit.orangebox.users.dbsetup.tables;

import java.util.Arrays;

public enum UsersTable {

    LOGIN("LOGIN"),
    FIRST_NAME("FIRST_NAME"),
    LAST_NAME("LAST_NAME");
    String columnName;


    UsersTable(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public static String[] allColumns() {
        return Arrays.stream(values()).map(UsersTable::getColumnName).toArray(String[]::new);
    }

}
