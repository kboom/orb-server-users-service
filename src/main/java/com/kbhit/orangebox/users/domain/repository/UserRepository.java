package com.kbhit.orangebox.users.domain.repository;

import com.kbhit.orangebox.users.domain.User;
import com.kbhit.orangebox.users.domain.UserId;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, UserId> {

    User findUserByLogin(String login);

}
