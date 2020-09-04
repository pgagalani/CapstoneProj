package io.pragra.capstonestudentregistration.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_INFO")
public class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column
  private double registrationFee;

  @Column
  private double consultingFee;

  @Column
  private double totalProgramFees;

  @Column
  private int numOfInstallments;

  @Column
  private double amountDue;


  @Override
  public String toString() {

    return "Payment{" + "registrationFee=" + registrationFee + ", consultingFee=" + consultingFee
        + ", totalProgramFees=" + totalProgramFees + ", numOfInstallments=" + numOfInstallments
        + '}';
  }
}
