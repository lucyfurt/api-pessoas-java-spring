package com.personapi.person.api.project.Repository;

import com.personapi.person.api.project.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
