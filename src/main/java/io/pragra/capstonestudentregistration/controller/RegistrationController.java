package io.pragra.capstonestudentregistration.controller;

import io.pragra.capstonestudentregistration.entity.Registration;
import io.pragra.capstonestudentregistration.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> addRegistration(@RequestBody Registration registration)
    {
            Registration reg=new Registration();
            if(reg.getId()!=0)
            {
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(reg);
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
