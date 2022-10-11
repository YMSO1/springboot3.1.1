package ru.solodilov.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.solodilov.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
