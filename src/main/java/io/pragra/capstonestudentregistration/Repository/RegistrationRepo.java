package io.pragra.capstonestudentregistration.Repository;

import io.pragra.capstonestudentregistration.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Long> {
}
