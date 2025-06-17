package com.eduacandoweb.course.repositories;

import com.eduacandoweb.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Spring data JPA ja tem uma implemtentaçao padrão para esta interface,
//então so com esta definição ja esta pronto.
public interface UserRepository extends JpaRepository<User,Long> {
//nao mechido 17/06/2025
   // void saveAll(List<User> list);

}
