package io.pragra.capstonestudentregistration;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.pragra.capstonestudentregistration.entity.Education;
import io.pragra.capstonestudentregistration.entity.Employer;
import io.pragra.capstonestudentregistration.entity.Payment;
import io.pragra.capstonestudentregistration.entity.Program;
import io.pragra.capstonestudentregistration.entity.Registration;
import io.pragra.capstonestudentregistration.entity.Student;
import io.pragra.capstonestudentregistration.service.RegistrationService;

@SpringBootApplication
public class CapstoneStudentRegistrationApplication {

  private RegistrationService service;

  public CapstoneStudentRegistrationApplication(RegistrationService service) {

    this.service = service;
  }

  public static void main(String[] args) {

    SpringApplication.run(CapstoneStudentRegistrationApplication.class, args);
  }

  /*@Bean
  CommandLineRunner runner() {

    return args -> {
      Student student = new Student();
      student.setFirstName("Payal");
      student.setLastName("Pancholi");
      student.setJoiningDate(new Date(2020 - 10 - 10));
      student.setBirthDate(new Date(1992 - 01 - 01));
      student.setEmail("pancholipayal.287@gmail.com");
      student.setAddress("Brampton");
      student.setMobileNumber(1234567890);
      student.setPhoneNumber(1234586798);
      Program program1 = new Program("Full Stack Developer", 3500);
      Program program2 = new Program("DevOps", 4000);
      Program program3 = new Program("Business Analyst", 2500);
      Program program4 = new Program("Front-end Developer", 3000);
      Program program5 = new Program("QA Automation", 3000);
      Education education =
          new Education("Bachelors", "Information Technology", "Gujarat University", 2015, student);
      // education.getStudent().setStudentId(student.getStudentId());
      Employer employer =
          new Employer("TCS", "Tata Consultancy Services", 1243543534, student, false);
      Payment payment = new Payment(50, 30, 3500, 2, student);
      service.addRegistration(new Registration(student, Arrays.asList(program1),
          Arrays.asList(education), Arrays.asList(employer), payment, new Date()));
    };
  }*/
}
