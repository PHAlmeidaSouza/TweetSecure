package com.TweetSecure.SpringSecurity.repositorie;

import com.TweetSecure.SpringSecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
