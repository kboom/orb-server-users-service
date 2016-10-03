package com.kbhit.orangebox.trading.domain.repository;

import com.kbhit.orangebox.trading.domain.User;
import com.kbhit.orangebox.trading.domain.UserId;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, UserId> {

}
