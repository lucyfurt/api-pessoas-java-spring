package com.personapi.person.api.project.service;


import com.personapi.person.api.project.Entity.Person;
import com.personapi.person.api.project.Repository.PersonRepository;
import com.personapi.person.api.project.dto.request.PersonDTO;
import com.personapi.person.api.project.dto.response.MessageResponseDTO;
import com.personapi.person.api.project.mapper.PersonMapper;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

public PersonService(PersonRepository personRepository){
    this.personRepository = personRepository;
}
public  MessageResponseDTO createPerson(PersonDTO personDTO){
    Person personToSave = personMapper.toModel(personDTO);
    Person savedPerson = personRepository.save(personToSave);
    return MessageResponseDTO
            .builder()
            .message("created person with id" + savedPerson.getId())
            .build();
}
}



