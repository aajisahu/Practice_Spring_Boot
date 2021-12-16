package com.mysqlpractice.controller;

import com.mysqlpractice.dto.PersonDTO;
import com.mysqlpractice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//    {
//        "id": "03",
//            "name": "Srikant Reddy",
//            "phone_no": "8643846895",
//            "email": "zyx@gmail.com"
//
//
//    }

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/addperson")
    public  String addPerson(@RequestBody PersonDTO personDTO){
        return personService.addPerson(personDTO);

    }

}
