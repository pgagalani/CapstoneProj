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

  @Override
  public String toString() {

    return "Payment{" + "registrationFee=" + registrationFee + ", consultingFee=" + consultingFee
        + ", totalProgramFees=" + totalProgramFees + ", numOfInstallments=" + numOfInstallments
        + '}';
  }
}
