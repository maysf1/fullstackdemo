package com.example.FULLSTACKBOOKDEMO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer> {

	@Query(value = "SELECT * FROM users WHERE id = ?1", nativeQuery = true)
	List<Users> getUsersById(Integer id);

}
