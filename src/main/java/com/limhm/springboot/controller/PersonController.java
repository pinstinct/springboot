package com.limhm.springboot.controller;

import com.limhm.springboot.dto.PersonDto;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {
    /*
    * Validating Form Input
    * https://spring.io/guides/gs/validating-form-input/
    * */

    @PostMapping("/person")
    public String checkPersonInfo(@Valid PersonDto personDto, BindingResult bindingResult) {
        StringBuilder message = new StringBuilder();
        if (bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors){
                message.append(error.getField() + " : " + error.getDefaultMessage() + System.lineSeparator());
            }
            return message.toString();
        }
        return "Congratulations! You are old enough to sign up for this site.";
    }
}
