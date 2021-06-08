package com.personapi.person.api.project.service;


import com.personapi.person.api.project.Entity.Person;
import com.personapi.person.api.project.Repository.PersonRepository;
import com.personapi.person.api.project.dto.response.MessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created Person with ID"+ savedPerson.getId())
                .build();
    }
}
