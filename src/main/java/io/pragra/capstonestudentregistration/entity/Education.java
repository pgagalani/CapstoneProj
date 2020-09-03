package io.pragra.capstonestudentregistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT_EDUCATION")
public class Education {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 255, nullable = false)
  private String credentialType;

  @Column(length = 255, nullable = false)
  private String field;

  @Column(length = 255, nullable = false)
  private String instituteName;

  @Column(length = 5, nullable = false)
  private int yearOfGraduation;
}
