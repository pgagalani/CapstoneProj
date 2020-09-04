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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REGISTRATION_INFO")
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @OneToOne(targetEntity = Student.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "studentId", referencedColumnName = "studentId")
  private Student student;

  /*@OneToMany(targetEntity = Program.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "registration_id")
  private List<Program> programs;*/
  @Column
  private String progName;

  @OneToOne(targetEntity = Payment.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "payment_id")
  private Payment paidFees;

  @OneToMany(targetEntity = PaymentSchedule.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "reg_id")
  private List<PaymentSchedule> paymentSchedule;

  @Column
  @Temporal(TemporalType.DATE)
  private Date registrationDate;

  @Override
  public String toString() {

    return "Registration{" + "student=" + student + ", programs=" + progName + ", education="
    /* + education + ", employers=" + employers + ", paidFees=" */ + paidFees
        + ", registrationDate=" + registrationDate + '}';
  }
}
