package com.jin.jwt.repository;

import com.jin.jwt.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities") // 권한 정보도 같이 가져옴 // lazy 조회아님
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
