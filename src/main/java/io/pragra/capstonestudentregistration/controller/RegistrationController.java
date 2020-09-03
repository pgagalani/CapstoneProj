package io.pragra.capstonestudentregistration.controller;

import io.pragra.capstonestudentregistration.entity.Registration;
import io.pragra.capstonestudentregistration.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class RegistrationController {
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> addRegistration(@RequestBody Registration registration)
    {

            if(Objects.nonNull(registration))
            {
                registration=this.registrationService.addRegistration(registration);
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(registration);
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @RequestMapping(value = "/getCandidate",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public ResponseEntity<List<?>> readAll()
    {
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
                .body(registrationService.getAll());
    }
}
