package org.tg.ppad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tg.ppad.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}