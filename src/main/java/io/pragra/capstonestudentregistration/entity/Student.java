package io.pragra.capstonestudentregistration.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT_TABLE")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long studentId;

  @Column(length = 255, nullable = false)
  private String firstName;

  @Column(length = 255, nullable = false)
  private String lastName;

  @Column
  @Temporal(TemporalType.DATE)
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date joiningDate;

  @Column
  private Date birthDate;

  @Column
  private long mobileNumber;

  @Column
  private long phoneNumber;

  @Column(length = 255, nullable = false)
  private String email;

  @Column(length = 300, nullable = false)
  private String address;

  @OneToMany(targetEntity = Education.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "student_id")
  private List<Education> education;

  @OneToMany(targetEntity = Employer.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "student_id")
  private List<Employer> employers;

  @Override
  public String toString() {

    return "Student{" + "studentId=" + studentId + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\'' + ", joiningDate=" + joiningDate + ", birthDate="
        + birthDate + ", mobileNumber=" + mobileNumber + ", phoneNumber=" + phoneNumber
        + ", email='" + email + '\'' + ", address='" + address + '\'' + '}';
  }
}
