package com.kbhit.orangebox.users.dbsetup;

import com.kbhit.orangebox.users.TestDataLoader;
import com.kbhit.orangebox.users.dbsetup.data.InsertDummyUsers;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.Operation;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

import static com.ninja_squad.dbsetup.operation.CompositeOperation.sequenceOf;

public final class DbSetupTestDataLoader implements TestDataLoader {

    @Autowired
    private DataSource dataSource;

    @Override
    public void cleanTables() {
        launchSequence(DataSetOperations.DELETE_ALL_DATA);
    }

    @Override
    public void createDummyUsers() {
        launchSequence(InsertDummyUsers.insertAll());
    }

    private void launchSequence(Operation... operations) {
        DataSourceDestination dataSourceDestination = new DataSourceDestination(dataSource);
        DbSetup dbSetup = new DbSetup(dataSourceDestination,
                sequenceOf(operations));
        dbSetup.launch();
    }

}
