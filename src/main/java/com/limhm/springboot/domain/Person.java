package com.limhm.springboot.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Date;

@Data
@EqualsAndHashCode(exclude = {"address", "city", "state", "zip"})
public class Person {
    /*
    * Reducing Boilerplate Code with Project Lombok
    * https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok
    * */
    enum Gender { Male, Female }

    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private final Gender gender;
    @NonNull private final Date dateOfBirth;

    private String ssn;
    private String address;
    private String city;
    private String state;
    private String zip;
}
