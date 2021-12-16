package com.mysqlpractice.service;

import com.mysqlpractice.dto.PersonDTO;
import com.mysqlpractice.model.Person;
import com.mysqlpractice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService{

    @Autowired
    private PersonRepository personRepository;
    @Override
    public String addPerson(PersonDTO personDTO){
            Person person= new Person();
            person.setId(personDTO.getId());
            person.setName(personDTO.getName());
            person.setPhone_no(personDTO.getPhone_no());
            person.setEmail(personDTO.getEmail());
            personRepository.save(person);
        return "Person Added Successfully !!";
    }


}
