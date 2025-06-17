package com.eduacandoweb.course.repositories;

import com.eduacandoweb.course.entities.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Spring data JPA ja tem uma implemtentaçao padrão para esta interface,
//então so com esta definição ja esta pronto.
public interface UserRepository extends JpaRepository<SecurityProperties.User,Long> {

    void saveAll(List<User> list);

}
