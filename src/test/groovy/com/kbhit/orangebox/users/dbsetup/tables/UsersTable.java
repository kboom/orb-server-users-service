package com.kbhit.orangebox.users.dbsetup.tables;

import java.util.Arrays;

public enum UsersTable {

    USER_ID("ID"),
    USERNAME("USERNAME"),
    PASSWORD("PASSWORD"),
    ACTIVATED("ACTIVATED");
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
