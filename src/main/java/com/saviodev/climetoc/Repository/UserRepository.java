package com.saviodev.climetoc.Repository;
import com.saviodev.climetoc.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}