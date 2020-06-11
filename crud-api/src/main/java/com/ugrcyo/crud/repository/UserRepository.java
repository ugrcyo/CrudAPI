package com.ugrcyo.crud.repository;

import com.ugrcyo.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);



}



