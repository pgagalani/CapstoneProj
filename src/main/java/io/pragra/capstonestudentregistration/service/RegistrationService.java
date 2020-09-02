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
        if (registration.getId()==0)
        {
            throw new RuntimeException("Registration Id is not present");
        }
        return this.repo.save(registration);
    }
}
