package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

    // 존재하면 true 존재하지 않으면 false
    boolean existsByName(String name);

    long countByAge(Integer age);
}
