package com.leonardo.dsmovie.repositories;

import com.leonardo.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */

public interface UserRepository extends JpaRepository<User, Long>
{
 User findByEmail(String emai);



}
