package io.pragra.capstonestudentregistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.pragra.capstonestudentregistration.entity.Program;

/**
 * Project CapstoneProj
 *
 * @author keshavr
 * @version 1.0
 * @date Sep 04, 2020
 */
public interface ProgramRepo extends JpaRepository<Program, Long> {
}
