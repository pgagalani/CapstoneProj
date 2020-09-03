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
@Table(name = "PROGRAM_TABLE")
public class Program {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long pid;

  @Column(length = 255, nullable = false)
  private String programName;

  @Column
  private double programFee;

  @Override
  public String toString() {

    return "Program{" + "programName='" + programName + '\'' + ", programFee=" + programFee + '}';
  }
}
