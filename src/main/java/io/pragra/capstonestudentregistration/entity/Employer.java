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
@Table(name = "EMPLOYER_INFO")
public class Employer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 255, nullable = true)
  private String employerName;

  @Column(length = 255, nullable = true)
  private String title;

  @Column
  private long phoneNumber;

  @Column
  private boolean isSponsored;

  @Override
  public String toString() {

    return "Employer{" + ", employerName='" + employerName + '\'' + ", title='" + title + '\''
        + ", phoneNumber=" + phoneNumber + " isSponsored=" + isSponsored + '}';
  }
}
