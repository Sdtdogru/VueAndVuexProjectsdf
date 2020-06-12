package com.backendvue.backendvue.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    @Query("select a from UserEntity as a where a.email=?1")
    UserEntity findByEmailAndPassword(String email);

}
