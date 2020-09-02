package io.pragra.capstonestudentregistration.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

  @OneToOne(targetEntity = Student.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Student student;

  @Column
  private boolean isSponsored;

  public Employer() {

  }

  public Employer(String employerName, String title, long phoneNumber, Student student,
      boolean isSponsored) {

    this.employerName = employerName;
    this.title = title;
    this.phoneNumber = phoneNumber;
    this.student = student;
    this.isSponsored = isSponsored;
  }

  public long getId() {

    return id;
  }

  public void setId(long id) {

    this.id = id;
  }

  public String getEmployerName() {

    return employerName;
  }

  public void setEmployerName(String employerName) {

    this.employerName = employerName;
  }

  public String getTitle() {

    return title;
  }

  public void setTitle(String title) {

    this.title = title;
  }

  public long getPhoneNumber() {

    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {

    this.phoneNumber = phoneNumber;
  }

  public long getStudent() {

    return student;
  }

  public void setStudent(long student) {

    this.student = student;
  }

  public boolean isSponsored() {

    return isSponsored;
  }

  public void setSponsored(boolean sponsored) {

    isSponsored = sponsored;
  }

  @Override
  public String toString() {

    return "Employer{" + ", employerName='" + employerName + '\'' + ", title='" + title + '\''
        + ", phoneNumber=" + phoneNumber + ", student=" + student + ", isSponsored=" + isSponsored
        + '}';
  }
}
