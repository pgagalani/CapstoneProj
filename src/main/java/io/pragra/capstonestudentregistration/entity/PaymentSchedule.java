package io.pragra.capstonestudentregistration.entity;

import java.util.Date;

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
@Table(name = "PAYMENT_SCHEDULE")
public class PaymentSchedule {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long scheduleId;

  @Column
  private double amount_due;

  @Column
  private Date datePaid;

  @Column
  private double invoiceNum;
}
