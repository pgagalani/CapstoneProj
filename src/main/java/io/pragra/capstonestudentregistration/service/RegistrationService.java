package io.pragra.capstonestudentregistration.service;

import io.pragra.capstonestudentregistration.Repository.RegistrationRepo;
import io.pragra.capstonestudentregistration.entity.Registration;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private RegistrationRepo repo;
    public RegistrationService(RegistrationRepo repo) {
        this.repo = repo;
    }

    public Registration addRegistration(Registration registration){
        return repo.save(registration);
    }
}
