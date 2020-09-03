package io.pragra.capstonestudentregistration.service;

import io.pragra.capstonestudentregistration.Repository.RegistrationRepo;
import io.pragra.capstonestudentregistration.entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RegistrationService {

    private RegistrationRepo repo;
    public RegistrationService(RegistrationRepo repo) {
        this.repo = repo;
    }

    public Registration addRegistration(Registration registration){
        if (Objects.isNull(registration))
        {
            throw new RuntimeException("Registration Id is not present");
        }
        return this.repo.save(registration);
    }
    public List<Registration> getAll()
    {
        return this.repo.findAll();
    }
}
