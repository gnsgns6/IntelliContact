package org.gns.intellicontact.dao;

import org.gns.intellicontact.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
