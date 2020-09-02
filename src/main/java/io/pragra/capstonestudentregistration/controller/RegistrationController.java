package io.pragra.capstonestudentregistration.controller;

import io.pragra.capstonestudentregistration.entity.Registration;
import io.pragra.capstonestudentregistration.service.RegistrationService;
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
    public Registration addRegistration(@RequestBody Registration registration)
    {
            return this.registrationService.addRegistration(registration);
    }
}
