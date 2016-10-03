package com.kbhit.orangebox.trading.dbsetup;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

import static com.kbhit.orangebox.trading.dbsetup.DbSetupUtils.DISABLE_FOREIGN_KEY_CHECKS;
import static com.kbhit.orangebox.trading.dbsetup.DbSetupUtils.ENABLE_FOREIGN_KEY_CHECKS;
import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;

class DataSetOperations {

    private static final Operation DELETE_USERS = deleteAllFrom("USERS");

    static final Operation DELETE_ALL_DATA = Operations.sequenceOf(
            DISABLE_FOREIGN_KEY_CHECKS,
            Operations.truncate("USERS"),
            ENABLE_FOREIGN_KEY_CHECKS
    );

}
