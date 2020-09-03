package io.pragra.capstonestudentregistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.pragra.capstonestudentregistration.entity.Employer;

/**
 * Project CapstoneProj
 *
 * @author keshavr
 * @version 1.0
 * @date Sep 04, 2020
 */
public interface EmployerRepo extends JpaRepository<Employer, Long> {
}
